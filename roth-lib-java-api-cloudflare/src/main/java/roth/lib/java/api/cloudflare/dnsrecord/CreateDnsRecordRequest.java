package roth.lib.java.api.cloudflare.dnsrecord;

import java.io.Serializable;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.cloudflare.type.DnsRecordType;

@Entity
@SuppressWarnings("serial")
public class CreateDnsRecordRequest implements Serializable
{
	@Property(name = "type")
	protected DnsRecordType type;
	
	@Property(name = "name")
	protected String name;
	
	@Property(name = "content")
	protected String content;
	
	@Property(name = "proxied")
	protected boolean proxied;
	
	@Property(name = "ttl")
	protected Integer ttl;
	
	protected CreateDnsRecordRequest()
	{
		
	}
	
	public CreateDnsRecordRequest(DnsRecordType type, String name, String content, boolean proxied)
	{
		this.type = type;
		this.name = name;
		this.content = content;
		this.proxied = proxied;
	}
	
	public DnsRecordType getType()
	{
		return type;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public boolean isProxied()
	{
		return proxied;
	}
	
	public int getTtl()
	{
		return ttl;
	}
	
	public CreateDnsRecordRequest setType(DnsRecordType type)
	{
		this.type = type;
		return this;
	}
	
	public CreateDnsRecordRequest setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public CreateDnsRecordRequest setContent(String content)
	{
		this.content = content;
		return this;
	}
	
	public CreateDnsRecordRequest setProxied(boolean proxied)
	{
		this.proxied = proxied;
		return this;
	}
	
	public CreateDnsRecordRequest setTtl(int ttl)
	{
		this.ttl = ttl;
		return this;
	}
	
}
