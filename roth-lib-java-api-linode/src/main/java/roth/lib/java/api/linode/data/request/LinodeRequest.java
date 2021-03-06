package roth.lib.java.api.linode.data.request;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class LinodeRequest implements LinodeConstants
{
	@Property(name = "api_key")
	protected String apiKey;
	
	@Property(name = "api_action")
	protected String apiAction;
	
	public LinodeRequest()
	{
		
	}
	
	public String getApiKey()
	{
		return apiKey;
	}
	
	public String getApiAction()
	{
		return apiAction;
	}
	
	public LinodeRequest setApiKey(String apiKey)
	{
		this.apiKey = apiKey;
		return this;
	}
	
	public LinodeRequest setApiAction(String apiAction)
	{
		this.apiAction = apiAction;
		return this;
	}
	
}
