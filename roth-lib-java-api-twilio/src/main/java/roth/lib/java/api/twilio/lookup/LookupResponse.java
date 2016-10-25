package roth.lib.java.api.twilio.lookup;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.TwilioResponse;

@Entity
@SuppressWarnings("serial")
public class LookupResponse extends TwilioResponse
{
	@Property(name = "url")
	protected String url;
	
	@Property(name = "national_format")
	protected String nationalFormat;
	
	@Property(name = "phone_number")
	protected String phoneNumber;
	
	@Property(name = "country_code")
	protected String countryCode;
	
	@Property(name = "carrier")
	protected Carrier carrier;
	
	@Property(name = "caller_name")
	protected CallerName callerName;
	
	public LookupResponse()
	{
		
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public String getNationalFormat()
	{
		return nationalFormat;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public String getCountryCode()
	{
		return countryCode;
	}
	
	public Carrier getCarrier()
	{
		return carrier;
	}
	
	public CallerName getCallerName()
	{
		return callerName;
	}
	
	public LookupResponse setUrl(String url)
	{
		this.url = url;
		return this;
	}
	
	public LookupResponse setNationalFormat(String nationalFormat)
	{
		this.nationalFormat = nationalFormat;
		return this;
	}

	public LookupResponse setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
		return this;
	}

	public LookupResponse setCountryCode(String countryCode)
	{
		this.countryCode = countryCode;
		return this;
	}

	public LookupResponse setCarrier(Carrier carrier)
	{
		this.carrier = carrier;
		return this;
	}

	public LookupResponse setCallerName(CallerName callerName)
	{
		this.callerName = callerName;
		return this;
	}
	
}
