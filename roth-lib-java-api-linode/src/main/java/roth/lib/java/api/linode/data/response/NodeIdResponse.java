package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class NodeIdResponse implements LinodeConstants
{
	@Property(name = "LinodeID")
	protected Integer linodeId;
	
	public NodeIdResponse()
	{
		
	}
	
	public Integer getLinodeId()
	{
		return linodeId;
	}
	
	public NodeIdResponse setLinodeId(Integer linodeId)
	{
		this.linodeId = linodeId;
		return this;
	}
	
}
