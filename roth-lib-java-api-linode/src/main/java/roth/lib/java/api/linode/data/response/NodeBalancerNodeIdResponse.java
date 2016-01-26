package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class NodeBalancerNodeIdResponse implements LinodeConstants
{
	@Property(name = "NodeID")
	protected Integer nodeId;
	
	public NodeBalancerNodeIdResponse()
	{
		
	}
	
	public Integer getNodeId()
	{
		return nodeId;
	}
	
	public NodeBalancerNodeIdResponse setNodeId(Integer nodeId)
	{
		this.nodeId = nodeId;
		return this;
	}
	
}
