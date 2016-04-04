package roth.lib.java.api.amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import roth.lib.java.Characters;
import roth.lib.java.api.XmlApiClient;
import roth.lib.java.api.amazon.type.RegionType;
import roth.lib.java.http.HttpMethod;
import roth.lib.java.http.HttpUrl;
import roth.lib.java.lang.List;
import roth.lib.java.lang.Map;
import roth.lib.java.util.IoUtil;
import roth.lib.java.util.MacUtil;
import roth.lib.java.util.MessageDigestUtil;

public abstract class AmazonClient extends XmlApiClient<Object, Object> implements Characters
{
	protected static final Pattern ENCODED_CHARACTERS_PATTERN 	= Pattern.compile("\\Q+\\E|\\Q*\\E|\\Q%7E\\E|\\Q%2F\\E");
	protected static final DateTimeFormatter DATE_FORMATTER 	= DateTimeFormatter.ofPattern("yyyyMMdd").withZone(ZoneId.of("UTC"));
	protected static final DateTimeFormatter TIME_FORMATTER 	= DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'").withZone(ZoneId.of("UTC"));
	protected static final String DATE_HEADER 					= "Date";
	protected static final String ACCEPT_HEADER 				= "Accept";
	protected static final String HOST_HEADER 					= "Host";
	protected static final String AUTHORIZATION_HEADER 			= "Authorization";
	protected static final String CONTENT_TYPE_HEADER 			= "Content-Type";
	protected static final String CONTENT_LENGTH_HEADER 		= "Content-Length";
	protected static final String X_AMZ_DATE_HEADER 			= "x-amz-date";
	protected static final String X_AMZ_CONTENT_SHA256_HEADER 	= "x-amz-content-sha256";
	
	protected String accessKey;
	protected String secretKey;
	
	protected AmazonClient(String accessKey, String secretKey, boolean debug)
	{
		super(debug);
		this.accessKey = accessKey;
		this.secretKey = secretKey;
	}
	
	@Override
	protected HttpUrl url()
	{
		return new HttpUrl();
	}
	
	protected static String getCanonicalRequest(HttpMethod method, String path, Map<String, String> paramMap, Map<String, String> headerMap, String contentHash)
	{
		StringBuilder builder = new StringBuilder();
		builder.append(method.toString());
		builder.append(NEW_LINE);
		builder.append(getCanonicalizedResourcePath(path));
		builder.append(NEW_LINE);
		builder.append(getCanonicalizedQuery(paramMap));
		builder.append(NEW_LINE);
		builder.append(getCanonicalizedHeader(headerMap));
		builder.append(NEW_LINE);
		builder.append(getSignedHeaders(headerMap));
		builder.append(NEW_LINE);
		builder.append(contentHash);
		return builder.toString();
	}
	
	protected static String getCanonicalizedResourcePath(String resourcePath)
	{
		if(resourcePath == null || resourcePath.isEmpty())
		{
			return "/";
		}
		else
		{
			String value = urlEncode(resourcePath, true);
			if(value.startsWith("/"))
			{
				return value;
			}
			else
			{
				return "/".concat(value);
			}
		}
	}
	
	 public static String urlEncode(final String value, final boolean path)
	 {
		if(value == null)
		{
			return "";
		}
		try
		{
			String encoded = URLEncoder.encode(value, "UTF-8");
			Matcher matcher = ENCODED_CHARACTERS_PATTERN.matcher(encoded);
			StringBuffer buffer = new StringBuffer(encoded.length());
			while(matcher.find())
			{
				String replacement = matcher.group(0);
				if("+".equals(replacement))
				{
					replacement = "%20";
				}
				else if("*".equals(replacement))
				{
					replacement = "%2A";
				}
				else if("%7E".equals(replacement))
				{
					replacement = "~";
				}
				else if(path && "%2F".equals(replacement))
				{
					replacement = "/";
				}
				matcher.appendReplacement(buffer, replacement);
			}
			matcher.appendTail(buffer);
			return buffer.toString();
		}
		catch (UnsupportedEncodingException ex)
		{
			throw new RuntimeException(ex);
		}
	}
	
	protected static String getCanonicalizedQuery(Map<String, String> paramMap)
	{
		StringBuilder builder = new StringBuilder();
		TreeMap<String, String> sortedParamMap = new TreeMap<String, String>();
		for(Entry<String, String> entry : paramMap.entrySet())
		{
			sortedParamMap.put(urlEncode(entry.getKey(), false), urlEncode(entry.getValue(), false));
		}
		String seperator = BLANK;
		for(Entry<String, String> entry : sortedParamMap.entrySet())
		{
			builder.append(seperator);
			builder.append(entry.getKey());
			builder.append(EQUAL);
			builder.append(entry.getValue());
			seperator = String.valueOf(AMPERSAND);
		}
		return builder.toString();
	}
	
	protected static String getCanonicalizedHeader(Map<String, String> headerMap)
	{
		StringBuilder builder = new StringBuilder();
		List<String> sortedHeaders = new List<String>().collection(headerMap.keySet());
		Collections.sort(sortedHeaders, String.CASE_INSENSITIVE_ORDER);
		for(String header : sortedHeaders)
		{
			String key = header.toLowerCase().replaceAll("\\s+", " ");
			String value = headerMap.get(header);
			builder.append(key);
			builder.append(COLON);
			if(value != null)
			{
				builder.append(value.replaceAll("\\s+", " "));
			}
			builder.append(NEW_LINE);
		}
		return builder.toString();
	}
	
	protected static String getSignedHeaders(Map<String, String> headerMap)
	{
		StringBuilder builder = new StringBuilder();
		List<String> headers = new List<String>().collection(headerMap.keySet());
		Collections.sort(headers, String.CASE_INSENSITIVE_ORDER);
		String seperator = BLANK;
		for(String header : headers)
		{
			builder.append(seperator);
			builder.append(header.toLowerCase());
			seperator = String.valueOf(SEMI_COLON);
		}
		return builder.toString();
	}
	
	protected static String getStringToSign(String time, String date, RegionType regionType, String service, String canonicalRequest)
	{
		StringBuilder builder = new StringBuilder();
		builder.append("AWS4-HMAC-SHA256");
		builder.append(NEW_LINE);
		builder.append(time);
		builder.append(NEW_LINE);
		builder.append(getScope(date, regionType, service));
		builder.append(NEW_LINE);
		builder.append(MessageDigestUtil.digestSha256Base16(canonicalRequest));
		return builder.toString();
	}
	
	protected static String getScope(String date, RegionType regionType, String service)
	{
		StringBuilder builder = new StringBuilder();
		builder.append(date);
		builder.append(SLASH);
		builder.append(regionType.toString());
		builder.append(SLASH);
		builder.append(service);
		builder.append(SLASH);
		builder.append("aws4_request");
		return builder.toString();
	}
	
	protected static String getSignature(String secretKey, HttpMethod method, String path, Map<String, String> paramMap, Map<String, String> headerMap, String contentHash, String time, String date, RegionType regionType, String service)
	{
		String canonicalRequest = getCanonicalRequest(method, path, paramMap, headerMap, contentHash);
		String stringToSign = getStringToSign(time, date, regionType, service, canonicalRequest);
		byte[] dateKey = MacUtil.hmacSha256("AWS4" + secretKey, date);
		byte[] dateRegionKey = MacUtil.hmacSha256(dateKey, regionType.toString());
		byte[] dateRegionServiceKey = MacUtil.hmacSha256(dateRegionKey, service);
		byte[] signingKey = MacUtil.hmacSha256(dateRegionServiceKey, "aws4_request");
		return MacUtil.hmacSha256Base16(signingKey, stringToSign);
	}
	
	protected static String getAuthorization(String accessKey, String secretKey, HttpMethod method, String path, Map<String, String> paramMap, Map<String, String> headerMap, String contentHash, String time, String date, RegionType regionType, String service)
	{
		StringBuilder builder = new StringBuilder();
		builder.append("AWS4-HMAC-SHA256");
		builder.append(SPACE);
		builder.append("Credential");
		builder.append(EQUAL);
		builder.append(accessKey);
		builder.append(SLASH);
		builder.append(getScope(date, regionType, service));
		builder.append(COMMA);
		builder.append("SignedHeaders");
		builder.append(EQUAL);
		builder.append(getSignedHeaders(headerMap));
		builder.append(COMMA);
		builder.append("Signature");
		builder.append(EQUAL);
		builder.append(getSignature(secretKey, method, path, paramMap, headerMap, contentHash, time, date, regionType, service));
		return builder.toString();
	}
	
	public static void main(String[] args) throws Exception
	{
		File file = new File("/Users/User/Downloads/test7.txt");
		InputStream input = new FileInputStream(file);
		
		Instant instant = Instant.now();
		String time = TIME_FORMATTER.format(instant);
		String date = DATE_FORMATTER.format(instant);
		String accessKey = "AKIAJIGOZ7MFOJIOF5SQ";
		String secretKey = "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";
		HttpMethod method = HttpMethod.PUT;
		String host = "aptexxtestupload.s3.amazonaws.com";
		//String path = "/test5.txt";
		String path = "/" + file.getName();
		RegionType regionType = RegionType.US_WEST_2;
		String service = "s3";
		String contentType = "text/plain";
		//String content = "blah\nblah\nblah";
		//ByteArrayInputStream input = new ByteArrayInputStream(content.getBytes());
		
		//String contentHash = MessageDigestUtil.digestSha256Base16(content);
		String contentHash = "UNSIGNED-PAYLOAD";
		Map<String, String> paramMap = new Map<String, String>();
		Map<String, String> headerMap = new Map<String, String>();
		headerMap.put("Host", host);
		headerMap.put("Content-Type", contentType);
		headerMap.put("x-amz-date", time);
		headerMap.put("x-amz-content-sha256", contentHash);
		
		String url = "https://" + host + path;
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setRequestMethod(method.toString());
		for(Entry<String, String> headerEntry : headerMap.entrySet())
		{
			connection.addRequestProperty(headerEntry.getKey(), headerEntry.getValue());
		}
		connection.addRequestProperty("Authorization", getAuthorization(accessKey, secretKey, method, path, paramMap, headerMap, contentHash, time, date, regionType, service));
		IoUtil.copy(input, connection.getOutputStream());
		connection.getOutputStream().flush();
		connection.connect();
		if(connection.getResponseCode() < 400)
		{
			String response = IoUtil.toString(connection.getInputStream());
			System.out.println(response);
			//System.out.println(new XmlMapper().prettyPrint(response));
		}
		else
		{
			System.out.println(connection.getResponseCode() + " : " + connection.getResponseMessage());
		}
	}
	
}
