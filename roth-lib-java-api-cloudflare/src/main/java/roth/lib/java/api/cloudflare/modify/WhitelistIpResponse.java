package roth.lib.java.api.cloudflare.modify;

import java.io.Serializable;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.cloudflare.model.IpAction;

@Entity
@SuppressWarnings("serial")
public class WhitelistIpResponse implements Serializable
{
	@Property(name = "result")
	protected IpAction result;
	
	public WhitelistIpResponse()
	{
		
	}
	
	public IpAction getResult()
	{
		return result;
	}
	
}