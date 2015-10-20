package roth.lib.java.api.linode.data.request.get;

import roth.lib.java.api.linode.data.request.NodeBalancerConfigIdRequest;

@SuppressWarnings("serial")
public class GetNodeBalancerConfigRequest extends NodeBalancerConfigIdRequest
{
	
	public GetNodeBalancerConfigRequest(Integer nodeBalancerId)
	{
		super();
		setNodeBalancerId(nodeBalancerId);
	}
	
}
