package roth.lib.java.api.twilio.number;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.TwilioResponse;

@Entity
@SuppressWarnings("serial")
public class AvailablePhoneNumber extends TwilioResponse
{
	@Property(name = "friendly_name")
	protected String friendlyName;
	
	@Property(name = "phone_number")
	protected String phoneNumber;
	
	@Property(name = "lata")
	protected String lata;
	
	@Property(name = "rate_center")
	protected String rateCenter;
	
	@Property(name = "latitude")
	protected String latitude;
	
	@Property(name = "longitude")
	protected String longitude;
	
	@Property(name = "region")
	protected String region;
	
	@Property(name = "postal_code")
	protected String postalCode;
	
	@Property(name = "iso_country")
	protected String isoCountry;
	
	@Property(name = "address_requirements")
	protected String addressRequirements;
	
	@Property(name = "beta")
	protected boolean beta;
	
	@Property(name = "capabilities")
	protected Capabilities capabilities;
	
	public AvailablePhoneNumber()
	{
		
	}

	public String getFriendlyName()
	{
		return friendlyName;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public String getLata()
	{
		return lata;
	}

	public String getRateCenter()
	{
		return rateCenter;
	}

	public String getLatitude()
	{
		return latitude;
	}

	public String getLongitude()
	{
		return longitude;
	}

	public String getRegion()
	{
		return region;
	}

	public String getPostalCode()
	{
		return postalCode;
	}

	public String getIsoCountry()
	{
		return isoCountry;
	}

	public String getAddressRequirements()
	{
		return addressRequirements;
	}

	public boolean isBeta()
	{
		return beta;
	}

	public Capabilities getCapabilities()
	{
		return capabilities;
	}

	public AvailablePhoneNumber setFriendlyName(String friendlyName)
	{
		this.friendlyName = friendlyName;
		return this;
	}

	public AvailablePhoneNumber setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
		return this;
	}

	public AvailablePhoneNumber setLata(String lata)
	{
		this.lata = lata;
		return this;
	}

	public AvailablePhoneNumber setRateCenter(String rateCenter)
	{
		this.rateCenter = rateCenter;
		return this;
	}

	public AvailablePhoneNumber setLatitude(String latitude)
	{
		this.latitude = latitude;
		return this;
	}

	public AvailablePhoneNumber setLongitude(String longitude)
	{
		this.longitude = longitude;
		return this;
	}

	public AvailablePhoneNumber setRegion(String region)
	{
		this.region = region;
		return this;
	}

	public AvailablePhoneNumber setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
		return this;
	}

	public AvailablePhoneNumber setIsoCountry(String isoCountry)
	{
		this.isoCountry = isoCountry;
		return this;
	}

	public AvailablePhoneNumber setAddressRequirements(String addressRequirements)
	{
		this.addressRequirements = addressRequirements;
		return this;
	}

	public AvailablePhoneNumber setBeta(boolean beta)
	{
		this.beta = beta;
		return this;
	}

	public AvailablePhoneNumber setCapabilities(Capabilities capabilities)
	{
		this.capabilities = capabilities;
		return this;
	}
	
}
