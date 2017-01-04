package roth.lib.java.api.cloudflare.test;

import roth.lib.java.api.cloudflare.dnsrecord.CreateDnsRecordRequest;
import roth.lib.java.api.cloudflare.type.DnsRecordType;

public class DnsRecordTest extends Test
{
	
	public static void main(String[] args)
	{
		//createDnsRecord();
	}
	
	protected static void createDnsRecord()
	{
		clientFactory.getDnsRecordClient().createDnsRecord(zoneId, new CreateDnsRecordRequest(DnsRecordType.CNAME, "asdf.roth.cm", "roth.cm", true));
	}
	
}
