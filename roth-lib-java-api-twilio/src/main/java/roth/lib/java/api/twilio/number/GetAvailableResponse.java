package roth.lib.java.api.twilio.number;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.TwilioResponse;
import roth.lib.java.lang.List;

@Entity
@SuppressWarnings("serial")
public class GetAvailableResponse extends TwilioResponse
{
	@Property(name = "available_phone_numbers")
	protected List<AvailablePhoneNumber> availablePhoneNumbers = new List<>();

	@Property(name = "uri")
	protected String uri;
	
	public GetAvailableResponse()
	{
		
	}
	
	public List<AvailablePhoneNumber> getAvailablePhoneNumbers()
	{
		return availablePhoneNumbers;
	}
	
	public String getUri()
	{
		return uri;
	}
	
	public GetAvailableResponse setAvailablePhoneNumbers(List<AvailablePhoneNumber> availablePhoneNumbers)
	{
		this.availablePhoneNumbers = availablePhoneNumbers;
		return this;
	}
	
	public GetAvailableResponse setUri(String uri)
	{
		this.uri = uri;
		return this;
	}
	
}