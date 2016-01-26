package roth.lib.java.api.digitalocean.droplet;

import java.util.LinkedList;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;
import roth.lib.java.api.digitalocean.model.Kernel;
import roth.lib.java.api.digitalocean.model.Meta;

@Entity
@SuppressWarnings("serial")
public class GetKernelsResponse implements DigitalOceanConstants
{
	@Property(name = "kernels")
	protected LinkedList<Kernel> kernels;
	
	@Property(name = "meta")
	protected Meta meta;
	
	public GetKernelsResponse()
	{
		
	}
	
	public LinkedList<Kernel> getKernels()
	{
		return kernels;
	}
	
	public Meta getMeta()
	{
		return meta;
	}
	
	public GetKernelsResponse setKernels(LinkedList<Kernel> kernels)
	{
		this.kernels = kernels;
		return this;
	}
	
	public GetKernelsResponse setMeta(Meta meta)
	{
		this.meta = meta;
		return this;
	}
	
}
