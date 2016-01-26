package roth.lib.java.api.digitalocean.size;

import java.util.LinkedList;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;
import roth.lib.java.api.digitalocean.model.Size;

@Entity
@SuppressWarnings("serial")
public class GetSizesResponse implements DigitalOceanConstants
{
	@Property(name = "sizes")
	protected LinkedList<Size> sizes;
	
	public GetSizesResponse()
	{
		
	}
	
	public LinkedList<Size> getSizes()
	{
		return sizes;
	}
	
	public GetSizesResponse setSizes(LinkedList<Size> sizes)
	{
		this.sizes = sizes;
		return this;
	}
	
}
