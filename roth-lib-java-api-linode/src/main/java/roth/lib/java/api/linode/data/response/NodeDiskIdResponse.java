package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class NodeDiskIdResponse implements LinodeConstants
{
	@Property(name = "DiskID")
	protected Integer diskId;
	
	public NodeDiskIdResponse()
	{
		
	}
	
	public Integer getDiskId()
	{
		return diskId;
	}
	
	public NodeDiskIdResponse setDiskId(Integer diskId)
	{
		this.diskId = diskId;
		return this;
	}
	
}
