package roth.lib.java.api.digitalocean.model;

import java.util.LinkedList;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;

@Entity
@SuppressWarnings("serial")
public class Region implements DigitalOceanConstants
{
	@Property(name = "slug")
	protected String slug;
	
	@Property(name = "name")
	protected String name;
	
	@Property(name = "sizes")
	protected LinkedList<String> sizes;
	
	@Property(name = "available")
	protected Boolean available;
	
	public Region()
	{
		
	}
	
	public String getSlug()
	{
		return slug;
	}
	
	public String getName()
	{
		return name;
	}
	
	public LinkedList<String> getSizes()
	{
		return sizes;
	}
	
	public Boolean getAvailable()
	{
		return available;
	}
	
	public Region setSlug(String slug)
	{
		this.slug = slug;
		return this;
	}
	
	public Region setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public Region setSizes(LinkedList<String> sizes)
	{
		this.sizes = sizes;
		return this;
	}
	
	public Region setAvailable(Boolean available)
	{
		this.available = available;
		return this;
	}
	
}
