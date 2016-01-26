package roth.lib.java.api.vultr.request;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.vultr.client.VultrConstants;

@Entity
@SuppressWarnings("serial")
public class VultrRequest implements VultrConstants
{
	@Property(name = "api_key")
	protected String apiKey;
	
	public VultrRequest()
	{
		
	}
	
	public String getApiKey()
	{
		return apiKey;
	}
	
	public VultrRequest setApiKey(String apiKey)
	{
		this.apiKey = apiKey;
		return this;
	}
	
}
