package roth.lib.java.api.cloudflare;

import roth.lib.java.api.JsonApiClient;
import roth.lib.java.http.HttpHeaders;
import roth.lib.java.http.HttpProtocol;
import roth.lib.java.http.HttpResponse;
import roth.lib.java.http.HttpUrl;

public abstract class CloudFlareClient extends JsonApiClient<Object, CloudFlareResponse<?>>
{
	protected static String HOST			= "api.cloudflare.com";
	protected static String PATH			= "/client/v4/";
	protected static String X_AUTH_EMAIL	= "X-Auth-Email";
	protected static String X_AUTH_KEY		= "X-Auth-Key";
	
	protected String email;
	protected String apiKey;
	
	protected CloudFlareClient(String email, String apiKey)
	{
		this(email, apiKey, false);
	}
	
	protected CloudFlareClient(String email, String apiKey, boolean debug)
	{
		super(debug);
		this.email = email;
		this.apiKey = apiKey;
	}
	
	@Override
	protected HttpUrl url()
	{
		return new HttpUrl().setProtocol(HttpProtocol.HTTPS).setHost(HOST).setPath(PATH);
	}
	
	@Override
	protected void setHeaders(HttpHeaders headers)
	{
		headers.setHeader(X_AUTH_EMAIL, email).setHeader(X_AUTH_KEY, apiKey);
	}
	
	@Override
	protected <T extends CloudFlareResponse<?>> void checkError(HttpResponse<T> response)
	{
		throw new CloudFlareException(response.getStatus().toString());
	}
	
	@Override
	protected <T extends CloudFlareResponse<?>> void checkResponse(HttpResponse<T> response)
	{
		T cloudFlareResponse = response.getEntity();
		if(cloudFlareResponse != null)
		{
			if(!cloudFlareResponse.isSuccess())
			{
				StringBuilder builder = new StringBuilder();
				String seperator = "";
				for(CloudFlareError error : cloudFlareResponse.getErrors())
				{
					builder.append(seperator);
					builder.append(error.getCode() + " : " + error.getMessage());
					seperator = ", ";
				}
				throw new CloudFlareException(builder.toString());
			}
		}
	}
	
}
