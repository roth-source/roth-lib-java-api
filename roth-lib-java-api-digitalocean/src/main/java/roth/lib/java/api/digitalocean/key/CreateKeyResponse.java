package roth.lib.java.api.digitalocean.key;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;
import roth.lib.java.api.digitalocean.model.Key;

@Entity
@SuppressWarnings("serial")
public class CreateKeyResponse implements DigitalOceanConstants
{
	@Property(name = "ssh_key")
	protected Key sshKey;
	
	public CreateKeyResponse()
	{
		
	}
	
	public Key getSshKey()
	{
		return sshKey;
	}
	
	public CreateKeyResponse setSshKey(Key sshKey)
	{
		this.sshKey = sshKey;
		return this;
	}
	
}
