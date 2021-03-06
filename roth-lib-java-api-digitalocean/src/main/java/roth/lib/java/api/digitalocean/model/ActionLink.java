package roth.lib.java.api.digitalocean.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;

@Entity
@SuppressWarnings("serial")
public class ActionLink implements DigitalOceanConstants
{
	@Property(name = "id")
	protected Integer id;
	
	@Property(name = "rel")
	protected String rel;
	
	@Property(name = "href")
	protected String href;
	
	public ActionLink()
	{
		
	}
	
	public Integer getId()
	{
		return id;
	}
	
	public String getRel()
	{
		return rel;
	}
	
	public String getHref()
	{
		return href;
	}
	
	public ActionLink setId(Integer id)
	{
		this.id = id;
		return this;
	}
	
	public ActionLink setRel(String rel)
	{
		this.rel = rel;
		return this;
	}
	
	public ActionLink setHref(String href)
	{
		this.href = href;
		return this;
	}
	
}
