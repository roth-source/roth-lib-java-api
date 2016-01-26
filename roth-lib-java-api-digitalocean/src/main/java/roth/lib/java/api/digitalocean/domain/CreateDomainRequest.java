package roth.lib.java.api.digitalocean.domain;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;

@Entity
@SuppressWarnings("serial")
public class CreateDomainRequest implements DigitalOceanConstants
{
	@Property(name = "name")
	protected String name;
	
	@Property(name = "ip_address")
	protected String ipAddress;
	
	public CreateDomainRequest(String name, String ipAddress)
	{
		this.name = name;
		this.ipAddress = ipAddress;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getIpAddress()
	{
		return ipAddress;
	}
	
	public CreateDomainRequest setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public CreateDomainRequest setIpAddress(String ipAddress)
	{
		this.ipAddress = ipAddress;
		return this;
	}
	
}
