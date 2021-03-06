package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class NodeIpResponse implements LinodeConstants
{
	@Property(name = "IPAddressID")
	protected Integer ipAddressId;
	
	@Property(name = "IPAddress")
	protected String ipAddress;
	
	@Property(name = "HOSTNAME")
	protected String hostname;
	
	public NodeIpResponse()
	{
		
	}
	
	public Integer getIpAddressId()
	{
		return ipAddressId;
	}
	
	public String getIpAddress()
	{
		return ipAddress;
	}
	
	public String getHostname()
	{
		return hostname;
	}
	
	public NodeIpResponse setIpAddressId(Integer ipAddressId)
	{
		this.ipAddressId = ipAddressId;
		return this;
	}
	
	public NodeIpResponse setIpAddress(String ipAddress)
	{
		this.ipAddress = ipAddress;
		return this;
	}
	
	public NodeIpResponse setHostname(String hostname)
	{
		this.hostname = hostname;
		return this;
	}
	
}
