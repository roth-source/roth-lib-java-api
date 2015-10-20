package roth.lib.java.api.cloudflare.modify;

import java.io.Serializable;
import java.util.Calendar;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.cloudflare.model.Zone;

@Entity
@SuppressWarnings("serial")
public class ClearCacheResponse implements Serializable
{
	@Property(name = "zone")
	protected Zone zone;
	
	@Property(name = "expires_on")
	protected Calendar expiresOn;
	
	@Property(name = "fpurge_ts")
	protected Calendar fpurgeTs;
	
	public ClearCacheResponse()
	{
		
	}
	
	public Zone getZone()
	{
		return zone;
	}
	
	public Calendar getExpiresOn()
	{
		return expiresOn;
	}
	
	public Calendar getFpurgeTs()
	{
		return fpurgeTs;
	}
	
}
