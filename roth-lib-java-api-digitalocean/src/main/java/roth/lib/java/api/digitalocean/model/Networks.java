package roth.lib.java.api.digitalocean.model;

import java.util.LinkedList;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;

@Entity
@SuppressWarnings("serial")
public class Networks implements DigitalOceanConstants
{
	@Property(name = "v4")
	protected LinkedList<Network> v4 = new LinkedList<Network>();
	
	@Property(name = "v6")
	protected LinkedList<Network> v6 = new LinkedList<Network>();
	
	public Networks()
	{
		
	}
	
	public LinkedList<Network> getV4()
	{
		return v4;
	}
	
	public LinkedList<Network> getV6()
	{
		return v6;
	}
	
	public Networks setV4(LinkedList<Network> v4)
	{
		this.v4 = v4;
		return this;
	}
	
	public Networks setV6(LinkedList<Network> v6)
	{
		this.v6 = v6;
		return this;
	}
	
}
