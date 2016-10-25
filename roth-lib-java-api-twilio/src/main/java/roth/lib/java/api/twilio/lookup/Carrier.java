package roth.lib.java.api.twilio.lookup;

import java.io.Serializable;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.type.PhoneType;

@Entity
@SuppressWarnings("serial")
public class Carrier implements Serializable
{
	@Property(name = "error_code")
	protected String errorCode;
	
	@Property(name = "type")
	protected PhoneType type;
	
	@Property(name = "name")
	protected String name;
	
	@Property(name = "mobile_network_code")
	protected String mobileNetworkCode;
	
	@Property(name = "mobile_country_code")
	protected String mobileCountryCode;
	
	public Carrier()
	{
		
	}
	
	public String getErrorCode()
	{
		return errorCode;
	}
	
	public PhoneType getType()
	{
		return type;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getMobileNetworkCode()
	{
		return mobileNetworkCode;
	}
	
	public String getMobileCountryCode()
	{
		return mobileCountryCode;
	}
	
	public Carrier setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
		return this;
	}
	
	public Carrier setType(PhoneType type)
	{
		this.type = type;
		return this;
	}
	
	public Carrier setName(String name)
	{
		this.name = name;
		return this;
	}
	
	public Carrier setMobileNetworkCode(String mobileNetworkCode)
	{
		this.mobileNetworkCode = mobileNetworkCode;
		return this;
	}
	
	public Carrier setMobileCountryCode(String mobileCountryCode)
	{
		this.mobileCountryCode = mobileCountryCode;
		return this;
	}
	
}
