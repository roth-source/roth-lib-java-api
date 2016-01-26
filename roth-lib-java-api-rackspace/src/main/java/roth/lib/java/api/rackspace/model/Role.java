package roth.lib.java.api.rackspace.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.rackspace.RackspaceConstants;

@Entity
@SuppressWarnings("serial")
public class Role implements RackspaceConstants
{
	@Property(name = "id")
	protected String id;
	
	@Property(name = "tenantId")
	protected String tenantId;
	
	@Property(name = "name")
	protected String name;
	
	@Property(name = "description")
	protected String description;
	
	public Role()
	{
		
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getTenantId()
	{
		return tenantId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public Role setId(String id)
	{
		this.id = id;
		return this;
	}
	
	public Role setTenantId(String tenantId)
	{
		this.tenantId = tenantId;
		return this;
	}
	
	public Role setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public Role setDescription(String description)
	{
		this.description = description;
		return this;
	}
	
}
