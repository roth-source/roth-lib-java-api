package roth.lib.java.api.cloudflare;

import java.util.LinkedHashMap;

import roth.lib.java.api.cloudflare.dnsrecord.DnsRecordClient;
import roth.lib.java.api.cloudflare.zone.ZoneClient;

public class CloudFlareClientFactory
{
	protected static LinkedHashMap<String, CloudFlareClientFactory> instanceMap = new LinkedHashMap<String, CloudFlareClientFactory>();
	
	protected ZoneClient zoneClient;
	protected DnsRecordClient dnsRecordClient;
	
	protected CloudFlareClientFactory(String email, String token, boolean debug)
	{
		zoneClient = new ZoneClient(email, token, debug);
		dnsRecordClient = new DnsRecordClient(email, token, debug);
	}
	
	public static CloudFlareClientFactory get(String email, String token)
	{
		return get(email, token, false);
	}
	
	public static CloudFlareClientFactory get(String email, String token, boolean debug)
	{
		String key = email + ":" + token;
		CloudFlareClientFactory ClientFactory = instanceMap.get(key);
		if(ClientFactory == null)
		{
			ClientFactory = new CloudFlareClientFactory(email, token, debug);
			instanceMap.put(key, ClientFactory);
		}
		return ClientFactory;
	}
	
	public static LinkedHashMap<String, CloudFlareClientFactory> getInstanceMap()
	{
		return instanceMap;
	}
	
	public ZoneClient getZoneClient()
	{
		return zoneClient;
	}
	
	public DnsRecordClient getDnsRecordClient()
	{
		return dnsRecordClient;
	}
	
}
