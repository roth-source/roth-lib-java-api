package roth.lib.java.api.digitalocean.key;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;
import roth.lib.java.api.digitalocean.model.Key;

@Entity
@SuppressWarnings("serial")
public class UpdateKeyResponse implements DigitalOceanConstants
{
	@Property(name = "ssh_key")
	protected Key sshKey;
	
	public UpdateKeyResponse()
	{
		
	}
	
	public Key getSshKey()
	{
		return sshKey;
	}
	
	public UpdateKeyResponse setSshKey(Key sshKey)
	{
		this.sshKey = sshKey;
		return this;
	}
	
}
