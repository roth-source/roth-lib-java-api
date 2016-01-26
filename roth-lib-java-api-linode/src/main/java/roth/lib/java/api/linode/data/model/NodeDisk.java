package roth.lib.java.api.linode.data.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;
import roth.lib.java.time.Time;

@Entity
@SuppressWarnings("serial")
public class NodeDisk implements LinodeConstants
{
	@Property(name = "LINODEID")
	protected Integer linodeId;
	
	@Property(name = "DISKID")
	protected Integer diskId;
	
	@Property(name = "CREATED_DT", timeFormat = TIME_FORMAT)
	protected Time createdDt;
	
	@Property(name = "UPDATE_DT", timeFormat = TIME_FORMAT)
	protected Time updateDt;
	
	@Property(name = "LABEL")
	protected String label;
	
	@Property(name = "TYPE")
	protected String type;
	
	@Property(name = "ISREADONLY")
	protected Boolean readOnly;
	
	@Property(name = "STATUS")
	protected Integer status;
	
	@Property(name = "SIZE")
	protected Integer size;
	
	public NodeDisk()
	{
		
	}
	
	public Integer getLinodeId()
	{
		return linodeId;
	}
	
	public Integer getDiskId()
	{
		return diskId;
	}
	
	public Time getCreatedDt()
	{
		return createdDt;
	}
	
	public Time getUpdateDt()
	{
		return updateDt;
	}
	
	public String getLabel()
	{
		return label;
	}
	
	public String getType()
	{
		return type;
	}
	
	public Boolean getReadOnly()
	{
		return readOnly;
	}
	
	public Integer getStatus()
	{
		return status;
	}
	
	public Integer getSize()
	{
		return size;
	}
	
	public NodeDisk setLinodeId(Integer linodeId)
	{
		this.linodeId = linodeId;
		return this;
	}
	
	public NodeDisk setDiskId(Integer diskId)
	{
		this.diskId = diskId;
		return this;
	}
	
	public NodeDisk setCreatedDt(Time createdDt)
	{
		this.createdDt = createdDt;
		return this;
	}
	
	public NodeDisk setUpdateDt(Time updateDt)
	{
		this.updateDt = updateDt;
		return this;
	}
	
	public NodeDisk setLabel(String label)
	{
		this.label = label;
		return this;
	}
	
	public NodeDisk setType(String type)
	{
		this.type = type;
		return this;
	}
	
	public NodeDisk setReadOnly(Boolean readOnly)
	{
		this.readOnly = readOnly;
		return this;
	}
	
	public NodeDisk setStatus(Integer status)
	{
		this.status = status;
		return this;
	}
	
	public NodeDisk setSize(Integer size)
	{
		this.size = size;
		return this;
	}
	
}
