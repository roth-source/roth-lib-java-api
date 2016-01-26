package roth.lib.java.api.digitalocean.key;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.digitalocean.DigitalOceanConstants;

@Entity
@SuppressWarnings("serial")
public class CreateKeyRequest implements DigitalOceanConstants
{
	@Property(name = "name")
	protected String name;
	
	@Property(name = "public_key")
	protected String publicKey;
	
	public CreateKeyRequest(String name)
	{
		this.name = name;
	}
	
	public CreateKeyRequest(String name, String publicKey)
	{
		this.name = name;
		this.publicKey = publicKey;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPublicKey()
	{
		return publicKey;
	}
	
	public CreateKeyRequest setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public CreateKeyRequest setPublicKey(String publicKey)
	{
		this.publicKey = publicKey;
		return this;
	}
	
}
