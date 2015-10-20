package roth.lib.java.api.cloudflare.modify;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.cloudflare.CloudFlareRequest;

@Entity
@SuppressWarnings("serial")
public class WhitelistIpRequest extends CloudFlareRequest
{
	@Property(name = "key")
	protected String key;
	
	public WhitelistIpRequest(String ip)
	{
		this.key = ip;
	}
	
	public String getKey()
	{
		return key;
	}
	
	public WhitelistIpRequest setKey(String key)
	{
		this.key = key;
		return this;
	}
	
	@Override
	public WhitelistIpRequest setAction(String action)
	{
		super.setAction(action);
		return this;
	}
	
	@Override
	public WhitelistIpRequest setEmail(String email)
	{
		super.setEmail(email);
		return this;
	}
	
	@Override
	public WhitelistIpRequest setToken(String token)
	{
		super.setToken(token);
		return this;
	}
	
}
