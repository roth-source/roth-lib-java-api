package roth.lib.java.api.digitalocean.domain;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;
import roth.lib.java.api.digitalocean.model.Domain;

@Entity
@SuppressWarnings("serial")
public class GetDomainResponse implements DigitalOceanConstants
{
	@Property(name = "domain")
	protected Domain domain;
	
	public GetDomainResponse()
	{
		
	}
	
	public Domain getDomain()
	{
		return domain;
	}
	
	public GetDomainResponse setDomain(Domain domain)
	{
		this.domain = domain;
		return this;
	}
	
}
