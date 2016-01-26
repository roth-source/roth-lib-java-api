package roth.lib.java.api.digitalocean.imageaction;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;
import roth.lib.java.api.digitalocean.type.RegionType;

@Entity
@SuppressWarnings("serial")
public class ImageActionRequest implements DigitalOceanConstants
{
	@Property(name = "type")
	protected String type;
	
	@Property(name = "region")
	protected String region;
	
	public ImageActionRequest()
	{
		
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getRegion()
	{
		return region;
	}
	
	public ImageActionRequest setType(String type)
	{
		this.type = type;
		return this;
	}
	
	public ImageActionRequest setRegion(String region)
	{
		this.region = region;
		return this;
	}
	
	public ImageActionRequest setRegionType(RegionType regionType)
	{
		setRegion(regionType.get());
		return this;
	}
	
}
