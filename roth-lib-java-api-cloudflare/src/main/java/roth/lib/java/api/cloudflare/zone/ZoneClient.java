package roth.lib.java.api.cloudflare.zone;

import roth.lib.java.api.cloudflare.CloudFlareClient;

public class ZoneClient extends CloudFlareClient
{
	
	public ZoneClient(String email, String apiKey)
	{
		super(email, apiKey);
	}
	
	public ZoneClient(String email, String apiKey, boolean debug)
	{
		super(email, apiKey, debug);
	}
	
}
