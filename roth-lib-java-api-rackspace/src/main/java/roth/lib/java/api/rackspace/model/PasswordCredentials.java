package roth.lib.java.api.rackspace.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.rackspace.RackspaceConstants;

@Entity
@SuppressWarnings("serial")
public class PasswordCredentials implements RackspaceConstants
{
	@Property(name = "username")
	protected String username;
	
	@Property(name = "password")
	protected String password;
	
	public PasswordCredentials(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public PasswordCredentials setUsername(String username)
	{
		this.username = username;
		return this;
	}
	
	public PasswordCredentials setPassword(String password)
	{
		this.password = password;
		return this;
	}
	
}
