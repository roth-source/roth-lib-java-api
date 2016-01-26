package roth.lib.java.api.digitalocean.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;

@Entity
@SuppressWarnings("serial")
public class PageLink implements DigitalOceanConstants
{
	@Property(name = "last")
	protected String last;
	
	@Property(name = "next")
	protected String next;
	
	public PageLink()
	{
		
	}
	
	public String getLast()
	{
		return last;
	}
	
	public String getNext()
	{
		return next;
	}
	
	public PageLink setLast(String last)
	{
		this.last = last;
		return this;
	}
	
	public PageLink setNext(String next)
	{
		this.next = next;
		return this;
	}
	
}
