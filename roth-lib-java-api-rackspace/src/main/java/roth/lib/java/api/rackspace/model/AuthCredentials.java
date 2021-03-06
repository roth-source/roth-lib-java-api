package roth.lib.java.api.rackspace.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.rackspace.RackspaceConstants;

@Entity
@SuppressWarnings("serial")
public class AuthCredentials implements RackspaceConstants
{
	@Property(name = "RAX-KSKEY:apiKeyCredentials")
	protected ApiKeyCredentials apiKeyCredentials;
	
	@Property(name = "passwordCredentials")
	protected PasswordCredentials passwordCredentials;
	
	public AuthCredentials(ApiKeyCredentials apiKeyCredentials)
	{
		this.apiKeyCredentials = apiKeyCredentials;
	}
	
	public AuthCredentials(PasswordCredentials passwordCredentials)
	{
		this.passwordCredentials = passwordCredentials;
	}
	
	public ApiKeyCredentials getApiKeyCredentials()
	{
		return apiKeyCredentials;
	}
	
	public PasswordCredentials getPasswordCredentials()
	{
		return passwordCredentials;
	}
	
	public AuthCredentials setApiKeyCredentials(ApiKeyCredentials apiKeyCredentials)
	{
		this.apiKeyCredentials = apiKeyCredentials;
		return this;
	}
	
	public AuthCredentials setPasswordCredentials(PasswordCredentials passwordCredentials)
	{
		this.passwordCredentials = passwordCredentials;
		return this;
	}
	
}
