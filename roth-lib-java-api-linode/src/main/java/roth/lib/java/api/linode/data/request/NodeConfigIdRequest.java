package roth.lib.java.api.linode.data.request;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;

@Entity
@SuppressWarnings("serial")
public abstract class NodeConfigIdRequest extends NodeIdRequest
{
	@Property(name = "ConfigID")
	protected Integer configId;
	
	public NodeConfigIdRequest()
	{
		
	}
	
	public Integer getConfigId()
	{
		return configId;
	}
	
	public NodeConfigIdRequest setConfigId(Integer configId)
	{
		this.configId = configId;
		return this;
	}
	
}
