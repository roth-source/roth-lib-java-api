package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class NodeBalancerIdResponse implements LinodeConstants
{
	@Property(name = "NodeBalancerID")
	protected Integer nodeBalancerId;
	
	public NodeBalancerIdResponse()
	{
		
	}
	
	public Integer getNodeBalancerId()
	{
		return nodeBalancerId;
	}
	
	public NodeBalancerIdResponse setNodeBalancerId(Integer nodeBalancerId)
	{
		this.nodeBalancerId = nodeBalancerId;
		return this;
	}
	
}
