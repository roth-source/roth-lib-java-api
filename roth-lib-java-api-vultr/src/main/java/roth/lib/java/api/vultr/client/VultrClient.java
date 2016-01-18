package roth.lib.java.api.vultr.client;

import roth.lib.java.api.FormJsonApiClient;
import roth.lib.java.api.vultr.request.VultrRequest;
import roth.lib.java.http.HttpProtocol;
import roth.lib.java.http.HttpResponse;
import roth.lib.java.http.HttpUrl;

public class VultrClient extends FormJsonApiClient<VultrRequest, Object>
{
	protected static String HOST			= "api.vultr.com";
	protected static String VERSION			= "/v1";
	protected static String SERVER			= "/server";
	protected static String BANDWIDTH		= "/bandwidth";
	protected static String API_KEY			= "api_key";
	
	protected static String TIME_FORMAT		= "yyyy-MM-dd HH:mm:ss.S";
	
	protected String apiKey;
	
	protected VultrClient(String apiKey)
	{
		this(apiKey, false);
	}
	
	protected VultrClient(String apiKey, boolean debug)
	{
		super(debug);
		this.apiKey = apiKey;
		setTimeFormat(TIME_FORMAT);
	}
	
	@Override
	protected HttpUrl url()
	{
		return new HttpUrl().setProtocol(HttpProtocol.HTTPS).setHost(HOST).addParam(API_KEY, apiKey);
	}
	
	protected HttpUrl url(String service)
	{
		return url().setPath(VERSION + service);
	}
	
	protected HttpUrl url(String service, VultrRequest vultrRequest)
	{
		//return url(service).setParameters(FormMapper.get().convert(vultrRequest, FORM_CONFIG));
		return url(service);
	}
	
	@Override
	protected <T> void checkResponse(HttpResponse<T> response)
	{
		
	}
	
}
