package roth.lib.java.api.cloudflare.dnsrecord;

import roth.lib.java.Generic;
import roth.lib.java.api.cloudflare.CloudFlareClient;
import roth.lib.java.api.cloudflare.CloudFlareResponse;
import roth.lib.java.http.HttpUrl;

public class DnsRecordClient extends CloudFlareClient
{
	protected static String ZONES = "zones";
	protected static String DNS_RECORDS = "dns_records";
	
	public DnsRecordClient(String email, String apiKey)
	{
		super(email, apiKey);
	}
	
	public DnsRecordClient(String email, String apiKey, boolean debug)
	{
		super(email, apiKey, debug);
	}
	
	protected HttpUrl url(String zoneId)
	{
		return url().addPath(ZONES).addPath("/").addPath(zoneId).addPath("/").addPath(DNS_RECORDS);
	}
	
	public CreateDnsRecordResponse createDnsRecord(String zoneId, CreateDnsRecordRequest request)
	{
		return post(url(zoneId), request, new Generic<CloudFlareResponse<CreateDnsRecordResponse>>(){}).getResult();
	}
	
}
