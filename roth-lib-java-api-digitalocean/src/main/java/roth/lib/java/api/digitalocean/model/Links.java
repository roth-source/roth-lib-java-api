package roth.lib.java.api.digitalocean.model;

import java.util.LinkedList;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;

@Entity
@SuppressWarnings("serial")
public class Links implements DigitalOceanConstants
{
	@Property(name = "actions")
	protected LinkedList<ActionLink> actions = new LinkedList<ActionLink>();
	
	@Property(name = "pages")
	protected LinkedList<PageLink> pages = new LinkedList<PageLink>();
	
	public Links()
	{
		
	}
	
	public LinkedList<ActionLink> getActions()
	{
		return actions;
	}
	
	public LinkedList<PageLink> getPages()
	{
		return pages;
	}
	
	public Links setActions(LinkedList<ActionLink> actions)
	{
		this.actions = actions;
		return this;
	}
	
	public Links setPages(LinkedList<PageLink> pages)
	{
		this.pages = pages;
		return this;
	}
	
}
