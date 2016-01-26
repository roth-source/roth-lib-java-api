package roth.lib.java.api.digitalocean.imageaction;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;
import roth.lib.java.api.digitalocean.model.Action;

@Entity
@SuppressWarnings("serial")
public class ImageActionResponse implements DigitalOceanConstants
{
	@Property(name = "action")
	protected Action action;
	
	public ImageActionResponse()
	{
		
	}
	
	public Action getAction()
	{
		return action;
	}
	
	public ImageActionResponse setAction(Action action)
	{
		this.action = action;
		return this;
	}
	
}
