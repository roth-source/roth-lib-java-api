package roth.lib.java.api.cloudflare;

import java.io.Serializable;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;

@Entity
@SuppressWarnings("serial")
public class CloudFlareResultInfo implements Serializable
{
	@Property(name = "page")
	protected int page;
	
	@Property(name = "per_page")
	protected int perPage;
	
	@Property(name = "count")
	protected int count;
	
	public CloudFlareResultInfo()
	{
		
	}
	
	public int getPage()
	{
		return page;
	}
	
	public int getPerPage()
	{
		return perPage;
	}
	
	public int getCount()
	{
		return count;
	}
	
}
