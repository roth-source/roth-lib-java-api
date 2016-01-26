package roth.lib.java.api.digitalocean.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;

@Entity
@SuppressWarnings("serial")
public class Meta implements DigitalOceanConstants
{
	@Property(name = "total")
	protected Integer total;
	
	public Meta()
	{
		
	}
	
	public Integer getTotal()
	{
		return total;
	}
	
	public Meta setTotal(Integer total)
	{
		this.total = total;
		return this;
	}
	
}
