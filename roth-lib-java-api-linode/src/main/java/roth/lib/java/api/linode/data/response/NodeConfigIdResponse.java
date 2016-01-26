package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class NodeConfigIdResponse implements LinodeConstants
{
	@Property(name = "ConfigID")
	protected Integer configId;
	
	public NodeConfigIdResponse()
	{
		
	}
	
	public Integer getConfigId()
	{
		return configId;
	}
	
	public NodeConfigIdResponse setConfigId(Integer configId)
	{
		this.configId = configId;
		return this;
	}
	
}
