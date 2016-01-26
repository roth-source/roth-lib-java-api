package roth.lib.java.api.rackspace.model;

import java.util.LinkedList;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.rackspace.RackspaceConstants;

@Entity
@SuppressWarnings("serial")
public class User implements RackspaceConstants
{
	@Property(name = "id")
	protected String id;
	
	@Property(name = "name")
	protected String name;
	
	@Property(name = "RAX-AUTH:defaultRegion")
	protected String defaultRegion;
	
	@Property(name = "roles")
	protected LinkedList<Role> roles = new LinkedList<Role>();
	
	public User()
	{
		
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDefaultRegion()
	{
		return defaultRegion;
	}
	
	public LinkedList<Role> getRoles()
	{
		return roles;
	}
	
	public User setId(String id)
	{
		this.id = id;
		return this;
	}
	
	public User setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public User setDefaultRegion(String defaultRegion)
	{
		this.defaultRegion = defaultRegion;
		return this;
	}
	
	public User setRoles(LinkedList<Role> roles)
	{
		this.roles = roles;
		return this;
	}
	
}
