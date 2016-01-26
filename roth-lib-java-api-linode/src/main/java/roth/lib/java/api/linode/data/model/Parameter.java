package roth.lib.java.api.linode.data.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class Parameter implements LinodeConstants
{
	@Property(name = "NAME")
	protected String name;
	
	@Property(name = "DESCRIPTION")
	protected String description;
	
	@Property(name = "TYPE")
	protected String type;
	
	@Property(name = "REQUIRED")
	protected Boolean required;
	
	public Parameter()
	{
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getType()
	{
		return type;
	}
	
	public Boolean getRequired()
	{
		return required;
	}
	
	public Parameter setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public Parameter setDescription(String description)
	{
		this.description = description;
		return this;
	}
	
	public Parameter setType(String type)
	{
		this.type = type;
		return this;
	}
	
	public Parameter setRequired(Boolean required)
	{
		this.required = required;
		return this;
	}
	
}
