package roth.lib.java.api.digitalocean.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;
import roth.lib.java.time.Time;

@Entity
@SuppressWarnings("serial")
public class Action implements DigitalOceanConstants
{
	@Property(name = "id")
	protected Integer id;
	
	@Property(name = "status")
	protected String status;
	
	@Property(name = "type")
	protected String type;
	
	@Property(name = "started_at", timeFormat = TIME_FORMAT)
	protected Time startedAt;
	
	@Property(name = "completed_at", timeFormat = TIME_FORMAT)
	protected Time completedAt;
	
	@Property(name = "resource_id")
	protected Integer resourceId;
	
	@Property(name = "resource_type")
	protected String resourceType;
	
	public Action()
	{
		
	}
	
	public Integer getId()
	{
		return id;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public String getType()
	{
		return type;
	}
	
	public Time getStartedAt()
	{
		return startedAt;
	}
	
	public Time getCompletedAt()
	{
		return completedAt;
	}
	
	public Integer getResourceId()
	{
		return resourceId;
	}
	
	public String getResourceType()
	{
		return resourceType;
	}
	
	public Action setId(Integer id)
	{
		this.id = id;
		return this;
	}
	
	public Action setStatus(String status)
	{
		this.status = status;
		return this;
	}
	
	public Action setType(String type)
	{
		this.type = type;
		return this;
	}
	
	public Action setStartedAt(Time startedAt)
	{
		this.startedAt = startedAt;
		return this;
	}
	
	public Action setCompletedAt(Time completedAt)
	{
		this.completedAt = completedAt;
		return this;
	}
	
	public Action setResourceId(Integer resourceId)
	{
		this.resourceId = resourceId;
		return this;
	}
	
	public Action setResourceType(String resourceType)
	{
		this.resourceType = resourceType;
		return this;
	}
	
}
