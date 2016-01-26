package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class NodeBalancerConfigIdResponse implements LinodeConstants
{
	@Property(name = "ConfigID")
	protected Integer configId;
	
	public NodeBalancerConfigIdResponse()
	{
		
	}
	
	public Integer getConfigId()
	{
		return configId;
	}
	
	public NodeBalancerConfigIdResponse setConfigId(Integer configId)
	{
		this.configId = configId;
		return this;
	}
	
}
