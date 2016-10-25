package roth.lib.java.api.twilio.lookup;

import roth.lib.java.api.twilio.TwilioClient;
import roth.lib.java.http.HttpProtocol;
import roth.lib.java.http.HttpUrl;

public class LookupClient extends TwilioClient
{
	protected static String LOOKUP_HOST 		= "lookups.twilio.com";
	protected static String LOOKUP_VERSION 		= "/v1";
	protected static String PHONE_NUMBERS		= "/PhoneNumbers/";
	protected static String TYPE				= "Type";
	protected static String CARRIER				= "carrier";
	protected static String CALLER_NAME			= "caller-name";
	
	public LookupClient(String accountSid, String authToken, boolean debug)
	{
		super(accountSid, authToken, debug);
	}
	
	@Override
	protected HttpUrl url()
	{
		return new HttpUrl().setProtocol(HttpProtocol.HTTPS).setHost(LOOKUP_HOST).setPath(LOOKUP_VERSION + PHONE_NUMBERS);
	}
	
	protected HttpUrl url(String number, String type)
	{
		HttpUrl url = url().addPath(number);
		if(type != null)
		{
			url.addParam(TYPE, type);
		}
		return url;
	}
	
	public LookupResponse lookup(String number)
	{
		return lookup(number, null);
	}
	
	public LookupResponse lookupCarrier(String number)
	{
		return lookup(number, CARRIER);
	}
	
	public LookupResponse lookupCallerName(String number)
	{
		return lookup(number, CALLER_NAME);
	}
	
	protected LookupResponse lookup(String number, String type)
	{
		return get(url(number, type), LookupResponse.class);
	}
	
}
