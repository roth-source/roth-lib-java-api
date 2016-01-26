package roth.lib.java.api.linode.data.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class NodeIp implements LinodeConstants
{
	@Property(name = "LINODEID")
	protected Integer linodeId;
	
	@Property(name = "IPADDRESSID")
	protected Integer ipAddressId;
	
	@Property(name = "IPADDRESS")
	protected String ipAddress;
	
	@Property(name = "RDNS_NAME")
	protected String rdnsName;
	
	@Property(name = "ISPUBLIC")
	protected Boolean _public;
	
	public NodeIp()
	{
		
	}
	
	public Integer getLinodeId()
	{
		return linodeId;
	}
	
	public Integer getIpAddressId()
	{
		return ipAddressId;
	}
	
	public String getIpAddress()
	{
		return ipAddress;
	}
	
	public String getRdnsName()
	{
		return rdnsName;
	}
	
	public Boolean getPublic()
	{
		return _public;
	}
	
	public NodeIp setLinodeId(Integer linodeId)
	{
		this.linodeId = linodeId;
		return this;
	}
	
	public NodeIp setIpAddressId(Integer ipAddressId)
	{
		this.ipAddressId = ipAddressId;
		return this;
	}
	
	public NodeIp setIpAddress(String ipAddress)
	{
		this.ipAddress = ipAddress;
		return this;
	}
	
	public NodeIp setRdnsName(String rdnsName)
	{
		this.rdnsName = rdnsName;
		return this;
	}
	
	public NodeIp setPublic(Boolean _public)
	{
		this._public = _public;
		return this;
	}
	
}
