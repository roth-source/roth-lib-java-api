package roth.lib.java.api.rackspace.identity;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.rackspace.RackspaceConstants;
import roth.lib.java.api.rackspace.model.ApiKeyCredentials;
import roth.lib.java.api.rackspace.model.AuthCredentials;

@Entity
@SuppressWarnings("serial")
public class AuthRequest implements RackspaceConstants
{
	@Property(name = "auth")
	protected AuthCredentials authCredentials;
	
	public AuthRequest(AuthCredentials authCredentials)
	{
		this.authCredentials = authCredentials;
	}
	
	public AuthRequest(String username, String apiKey)
	{
		this.authCredentials = new AuthCredentials(new ApiKeyCredentials(username, apiKey));
	}
	
	public AuthCredentials getAuthCredentials()
	{
		return authCredentials;
	}
	
	public AuthRequest setAuthCredentials(AuthCredentials authCredentials)
	{
		this.authCredentials = authCredentials;
		return this;
	}
	
}
