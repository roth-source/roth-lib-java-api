package roth.lib.java.api.rackspace.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.rackspace.RackspaceConstants;
import roth.lib.java.time.Time;

@Entity
@SuppressWarnings("serial")
public class AuthToken implements RackspaceConstants
{
	@Property(name = "id")
	protected String id;
	
	@Property(name = "expires", timeFormat = TIME_FORMAT)
	protected Time expires;
	
	public AuthToken()
	{
		
	}
	
	public String getId()
	{
		return id;
	}
	
	public Time getExpires()
	{
		return expires;
	}
	
	public AuthToken setId(String id)
	{
		this.id = id;
		return this;
	}
	
	public AuthToken setExpires(Time expires)
	{
		this.expires = expires;
		return this;
	}
	
	public boolean isExpired()
	{
		return expires.isBeforeNow();
	}
	
}
