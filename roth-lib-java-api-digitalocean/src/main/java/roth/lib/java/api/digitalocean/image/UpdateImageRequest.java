package roth.lib.java.api.digitalocean.image;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;

@Entity
@SuppressWarnings("serial")
public class UpdateImageRequest implements DigitalOceanConstants
{
	@Property(name = "name")
	protected String name;
	
	public UpdateImageRequest(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public UpdateImageRequest setName(String name)
	{
		this.name = name;
		return this;
	}
	
}
