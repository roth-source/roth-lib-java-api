package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class DomainResourceIdResponse implements LinodeConstants
{
	@Property(name = "ResourceID")
	protected Integer resourceId;
	
	public DomainResourceIdResponse()
	{
		
	}
	
	public Integer getResourceId()
	{
		return resourceId;
	}
	
	public DomainResourceIdResponse setResourceId(Integer resourceId)
	{
		this.resourceId = resourceId;
		return this;
	}
	
}
