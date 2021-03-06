package roth.lib.java.api.rackspace.identity;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.rackspace.RackspaceConstants;
import roth.lib.java.api.rackspace.model.Access;

@Entity
@SuppressWarnings("serial")
public class AuthResponse implements RackspaceConstants
{
	@Property(name = "access")
	protected Access access;
	
	public AuthResponse()
	{
		
	}
	
	public Access getAccess()
	{
		return access;
	}
	
	public AuthResponse setAccess(Access access)
	{
		this.access = access;
		return this;
	}
	
}
