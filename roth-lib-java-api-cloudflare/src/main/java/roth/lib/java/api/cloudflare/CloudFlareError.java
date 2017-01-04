package roth.lib.java.api.cloudflare;

import java.io.Serializable;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;

@Entity
@SuppressWarnings("serial")
public class CloudFlareError implements Serializable
{
	@Property(name = "code")
	protected String code;
	
	@Property(name = "message")
	protected String message;
	
	public CloudFlareError()
	{
		
	}
	
	public String getCode()
	{
		return code;
	}
	
	public String getMessage()
	{
		return message;
	}
	
}
