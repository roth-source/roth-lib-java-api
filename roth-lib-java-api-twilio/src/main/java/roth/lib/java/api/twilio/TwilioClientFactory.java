package roth.lib.java.api.twilio;

import java.util.LinkedHashMap;

import roth.lib.java.api.twilio.call.CallClient;
import roth.lib.java.api.twilio.lookup.LookupClient;
import roth.lib.java.api.twilio.message.MessageClient;
import roth.lib.java.api.twilio.number.NumberClient;

public class TwilioClientFactory
{
	protected static LinkedHashMap<String, TwilioClientFactory> instanceMap = new LinkedHashMap<String, TwilioClientFactory>();
	
	protected MessageClient messageClient;
	protected CallClient callClient;
	protected NumberClient numberClient;
	protected LookupClient lookupClient;
	
	protected TwilioClientFactory(String accountSid, String authToken, boolean debug)
	{
		messageClient = new MessageClient(accountSid, authToken, debug);
		callClient = new CallClient(accountSid, authToken, debug);
		numberClient = new NumberClient(accountSid, authToken, debug);
		lookupClient = new LookupClient(accountSid, authToken, debug);
	}
	
	public static TwilioClientFactory get(String accountSid, String authToken)
	{
		return get(accountSid, authToken, false);
	}
	
	public static TwilioClientFactory get(String accountSid, String authToken, boolean debug)
	{
		String token = accountSid + ":" + authToken;
		TwilioClientFactory clientFactory = instanceMap.get(token);
		if(clientFactory == null)
		{
			clientFactory = new TwilioClientFactory(accountSid, authToken, debug);
			instanceMap.put(token, clientFactory);
		}
		return clientFactory;
	}
	
	public static LinkedHashMap<String, TwilioClientFactory> getInstanceMap()
	{
		return instanceMap;
	}
	
	public MessageClient getMessageClient()
	{
		return messageClient;
	}
	
	public CallClient getCallClient()
	{
		return callClient;
	}
	
	public NumberClient getNumberClient()
	{
		return numberClient;
	}
	
	public LookupClient getLookupClient()
	{
		return lookupClient;
	}
	
}
