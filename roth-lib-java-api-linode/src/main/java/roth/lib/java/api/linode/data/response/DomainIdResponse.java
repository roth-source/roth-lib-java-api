package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class DomainIdResponse implements LinodeConstants
{
	@Property(name = "DomainID")
	protected Integer domainId;
	
	public DomainIdResponse()
	{
		
	}
	
	public Integer getDomainId()
	{
		return domainId;
	}
	
	public DomainIdResponse setDomainId(Integer domainId)
	{
		this.domainId = domainId;
		return this;
	}
	
}
