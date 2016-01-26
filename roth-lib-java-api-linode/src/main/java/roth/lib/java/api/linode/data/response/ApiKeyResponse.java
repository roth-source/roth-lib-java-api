package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class ApiKeyResponse implements LinodeConstants
{
	@Property(name = "USERNAME")
	protected String username;
	
	@Property(name = "API_KEY")
	protected String apiKey;
	
	public ApiKeyResponse()
	{
		
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getApiKey()
	{
		return apiKey;
	}
	
	public ApiKeyResponse setUsername(String username)
	{
		this.username = username;
		return this;
	}
	
	public ApiKeyResponse setApiKey(String apiKey)
	{
		this.apiKey = apiKey;
		return this;
	}
	
}
