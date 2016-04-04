package roth.lib.java.api.amazon.s3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.util.Map.Entry;

import roth.lib.java.api.amazon.AmazonClient;
import roth.lib.java.api.amazon.AmazonException;
import roth.lib.java.api.amazon.type.RegionType;
import roth.lib.java.http.HttpHeader;
import roth.lib.java.http.HttpMethod;
import roth.lib.java.http.HttpResponse;
import roth.lib.java.http.HttpStatusCode;
import roth.lib.java.http.HttpUrl;
import roth.lib.java.lang.List;
import roth.lib.java.lang.Map;
import roth.lib.java.outputter.BytesOutputter;
import roth.lib.java.outputter.StreamOutputter;
import roth.lib.java.type.MimeType;
import roth.lib.java.util.MessageDigestUtil;

public class S3Client extends AmazonClient
{
	protected static final String UNSIGNED_PAYLOAD = "UNSIGNED-PAYLOAD";
	protected static final String SERVICE = "s3";
	protected static final String HOST = "amazonaws.com";
	protected static final String BLANK_HASH = MessageDigestUtil.digestSha256Base16(BLANK);
	protected static final int MAX_ATTEMPTS = 3;
	
	protected int maxAttempts = MAX_ATTEMPTS;
	
	public S3Client(String accessKey, String secretKey)
	{
		this(accessKey, secretKey, false);
	}
	
	public S3Client(String accessKey, String secretKey, boolean debug)
	{
		super(accessKey, secretKey, debug);
	}
	
	public int getMaxAttempts()
	{
		return maxAttempts;
	}
	
	public S3Client setMaxAttempts(int maxAttempts)
	{
		this.maxAttempts = maxAttempts;
		return this;
	}
	
	protected HttpUrl url(String bucket, String path)
	{
		return new HttpUrl(true).setHost(bucket + DOT + SERVICE + DOT + HOST).addPath(path);
	}
	
	protected HttpHeader[] getHeaders(HttpUrl url, HttpMethod method, RegionType regionType)
	{
		return getHeaders(url, method, regionType, BLANK_HASH, null, null);
	}
	
	protected HttpHeader[] getHeaders(HttpUrl url, HttpMethod method, RegionType regionType, String contentHash, MimeType contentType, Long contentLength)
	{
		Instant instant = Instant.now();
		String time = TIME_FORMATTER.format(instant);
		String date = DATE_FORMATTER.format(instant);
		Map<String, String> headerMap = new Map<>();
		headerMap.put(HOST_HEADER, url.getHost());
		headerMap.put(X_AMZ_DATE_HEADER, time);
		headerMap.put(X_AMZ_CONTENT_SHA256_HEADER, contentHash);
		List<HttpHeader> headers = new List<>();
		if(contentType != null)
		{
			headerMap.put(CONTENT_TYPE_HEADER, contentType.toString());
		}
		else
		{
			headers.add(new HttpHeader(CONTENT_TYPE_HEADER, null));
		}
		///*
		if(contentLength != null)
		{
			headerMap.put(CONTENT_LENGTH_HEADER, String.valueOf(contentLength));
		}
		else
		{
			headers.add(new HttpHeader(CONTENT_LENGTH_HEADER, null));
		}
		//*/
		for(Entry<String, String> headerEntry : headerMap.entrySet())
		{
			headers.add(new HttpHeader(headerEntry.getKey(), headerEntry.getValue()));
		}
		headers.add(new HttpHeader(AUTHORIZATION_HEADER, getAuthorization(accessKey, secretKey, method, url.getPath(), url.getParamMap(), headerMap, contentHash, time, date, regionType, SERVICE)));
		headers.add(new HttpHeader(ACCEPT_HEADER, null));
		headers.add(new HttpHeader(DATE_HEADER, null));
		return headers.toArray(new HttpHeader[0]);
	}
	
	@Override
	protected <T> void checkResponse(HttpResponse<T> response)
	{
		if(!response.isSuccess())
		{
			throw new AmazonException(response.getStatus());
		}
	}
	
	public boolean hasObject(RegionType regionType, String bucket, String path)
	{
		return hasObject(regionType, bucket, path, 1);
	}
	
	protected boolean hasObject(RegionType regionType, String bucket, String path, int attempt)
	{
		try
		{
			HttpUrl url = url(bucket, path);
			headResponse(url, getHeaders(url, HttpMethod.HEAD, regionType));
			return true;
		}
		catch(AmazonException e)
		{
			if(e.getStatus().is(HttpStatusCode._404))
			{
				return false;
			}
			else
			{
				if(attempt < maxAttempts)
				{
					return hasObject(regionType, bucket, path, ++attempt);
				}
				else
				{
					throw e;
				}
			}
		}
	}
	
	public InputStream getObject(RegionType regionType, String bucket, String path)
	{
		return getObject(regionType, bucket, path, 1);
	}
	
	protected InputStream getObject(RegionType regionType, String bucket, String path, int attempt)
	{
		try
		{
			HttpUrl url = url(bucket, path);
			return getResponse(url, getHeaders(url, HttpMethod.GET, regionType)).getInput();
		}
		catch(AmazonException e)
		{
			if(attempt < maxAttempts)
			{
				return getObject(regionType, bucket, path, ++attempt);
			}
			else
			{
				throw e;
			}
		}
	}
	
	public void putObject(RegionType regionType, String bucket, String path, MimeType contentType, byte[] bytes)
	{
		String contentHash = MessageDigestUtil.digestSha256Base16(bytes);
		HttpUrl url = url(bucket, path);
		put(url, new BytesOutputter(bytes), getHeaders(url, HttpMethod.PUT, regionType, contentHash, contentType, (long) bytes.length));
	}
	
	public void putObject(RegionType regionType, String bucket, String path, MimeType contentType, File file) throws IOException
	{
		try(FileInputStream input = new FileInputStream(file))
		{
			putObject(regionType, bucket, path, contentType, input, null);
		}
	}
	
	public void putObject(RegionType regionType, String bucket, String path, MimeType contentType, InputStream input)
	{
		putObject(regionType, bucket, path, contentType, input, null);
	}
	
	public void putObject(RegionType regionType, String bucket, String path, MimeType contentType, InputStream input, Long contentLength)
	{
		HttpUrl url = url(bucket, path);
		put(url, new StreamOutputter(input), getHeaders(url, HttpMethod.PUT, regionType, UNSIGNED_PAYLOAD, contentType, contentLength));
	}
	
}