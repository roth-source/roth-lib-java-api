package roth.lib.java.api.digitalocean.model;

import java.util.LinkedList;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;
import roth.lib.java.time.Time;

@Entity
@SuppressWarnings("serial")
public class Image implements DigitalOceanConstants
{
	@Property(name = "id")
	protected Integer id;
	
	@Property(name = "name")
	protected String name;
	
	@Property(name = "distribution")
	protected String distribution;
	
	@Property(name = "slug")
	protected String slug;
	
	@Property(name = "public")
	protected Boolean _public;
	
	@Property(name = "regions")
	protected LinkedList<String> regions;
	
	@Property(name = "created_at", timeFormat = TIME_FORMAT)
	protected Time createdAt;
	
	public Image()
	{
		
	}
	
	public Integer getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDistribution()
	{
		return distribution;
	}
	
	public String getSlug()
	{
		return slug;
	}
	
	public Boolean getPublic()
	{
		return _public;
	}
	
	public LinkedList<String> getRegions()
	{
		return regions;
	}
	
	public Time getCreatedAt()
	{
		return createdAt;
	}
	
	public Image setId(Integer id)
	{
		this.id = id;
		return this;
	}
	
	public Image setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public Image setDistribution(String distribution)
	{
		this.distribution = distribution;
		return this;
	}
	
	public Image setSlug(String slug)
	{
		this.slug = slug;
		return this;
	}
	
	public Image setPublic(Boolean _public)
	{
		this._public = _public;
		return this;
	}
	
	public Image setRegions(LinkedList<String> regions)
	{
		this.regions = regions;
		return this;
	}
	
	public Image setCreatedAt(Time createdAt)
	{
		this.createdAt = createdAt;
		return this;
	}
	
}
