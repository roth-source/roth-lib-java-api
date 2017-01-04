package roth.lib.java.api.cloudflare.model;

import java.io.Serializable;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.cloudflare.type.DnsRecordType;

@Entity
@SuppressWarnings("serial")
public class DnsRecord implements Serializable
{
	@Property(name = "id")
	protected String id;
	
	@Property(name = "type")
	protected DnsRecordType type;
	
	@Property(name = "name")
	protected String name;
	
	@Property(name = "content")
	protected String content;
	
	@Property(name = "proxiable")
	protected boolean proxiable;
	
	@Property(name = "proxied")
	protected boolean proxied;
	
	@Property(name = "ttl")
	protected int ttl;
	
	@Property(name = "locked")
	protected boolean locked;
	
	@Property(name = "zone_id")
	protected String zoneId;
	
	@Property(name = "zone_name")
	protected String zoneName;
	
	@Property(name = "created_on")
	protected String createdOn;
	
	@Property(name = "modified_on")
	protected String modifiedOn;
	
	public DnsRecord()
	{
		
	}
	
	public String getId()
	{
		return id;
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
	
	public boolean isProxiable()
	{
		return proxiable;
	}
	
	public boolean isProxied()
	{
		return proxied;
	}
	
	public int getTtl()
	{
		return ttl;
	}
	
	public boolean isLocked()
	{
		return locked;
	}
	
	public String getZoneId()
	{
		return zoneId;
	}
	
	public String getZoneName()
	{
		return zoneName;
	}
	
	public String getCreatedOn()
	{
		return createdOn;
	}
	
	public String getModifiedOn()
	{
		return modifiedOn;
	}
	
}
