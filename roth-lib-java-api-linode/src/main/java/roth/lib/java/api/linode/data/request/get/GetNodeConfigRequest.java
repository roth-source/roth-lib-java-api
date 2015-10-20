package roth.lib.java.api.linode.data.request.get;

import roth.lib.java.api.linode.data.request.NodeConfigIdRequest;

@SuppressWarnings("serial")
public class GetNodeConfigRequest extends NodeConfigIdRequest
{
	
	public GetNodeConfigRequest(Integer linodeId)
	{
		super();
		setLinodeId(linodeId);
	}
	
}
