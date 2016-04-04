package roth.lib.java.api.twilio.number;

import roth.lib.java.api.twilio.TwilioClient;
import roth.lib.java.api.twilio.type.CountryType;
import roth.lib.java.form.FormMapper;

public class NumberClient extends TwilioClient
{
	
	public NumberClient(String accountSid, String authToken, boolean debug)
	{
		super(accountSid, authToken, debug);
	}
	
	public GetAvailableResponse getAvailable(CountryType countryType, GetAvailableRequest request)
	{
		return get(url(AVAILABLE + SLASH + countryType.toString() + LOCAL).setParamMap(new FormMapper().getParamMap(request)), GetAvailableResponse.class);
	}
	
	public PhoneNumber provision(ProvisionRequest request)
	{
		return post(url(INCOMING), request, PhoneNumber.class);
	}
	
	public PhoneNumber get(String id)
	{
		return get(url(INCOMING + SLASH + id), PhoneNumber.class);
	}
	
	public PhoneNumber findNumber(String number)
	{
		return ((PhoneNumbersResponse) get(url(INCOMING).addParam("PhoneNumber", number), PhoneNumbersResponse.class)).getPhoneNumbers().peekFirst();
	}
	
	public void delete(String id)
	{
		delete(url(INCOMING + SLASH + id));
	}
	
	public void deleteNumber(String number)
	{
		PhoneNumber phoneNumber = findNumber(number);
		if(phoneNumber != null)
		{
			delete(phoneNumber.getSid());
		}
	}
	
}
