package roth.lib.java.api.linode.data.request.update;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.data.request.NodeDiskRequest;

@Entity
@SuppressWarnings("serial")
public class UpdateNodeDiskRequest extends NodeDiskRequest
{
	@Property(name = "DiskID")
	protected Integer diskId;
	
	@Property(name = "isReadOnly")
	protected Boolean readOnly;
	
	public UpdateNodeDiskRequest(Integer diskId)
	{
		super();
		setDiskId(diskId);
	}
	
	public Integer getDiskId()
	{
		return diskId;
	}
	
	public Boolean getReadOnly()
	{
		return readOnly;
	}
	
	public UpdateNodeDiskRequest setDiskId(Integer diskId)
	{
		this.diskId = diskId;
		return this;
	}
	
	public UpdateNodeDiskRequest setReadOnly(Boolean readOnly)
	{
		this.readOnly = readOnly;
		return this;
	}
	
}
