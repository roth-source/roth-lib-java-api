package roth.lib.java.api.twilio.test;

import roth.lib.java.api.twilio.number.GetAvailableRequest;
import roth.lib.java.api.twilio.number.ProvisionRequest;
import roth.lib.java.api.twilio.type.CountryType;

public class NumberTest extends Test
{
	
	public static void main(String[] args)
	{
		//getAvailable();
		//provision();
		//get();
		//delete();
	}
	
	public static void getAvailable()
	{
		clientFactory.getNumberClient().getAvailable(CountryType.US, new GetAvailableRequest().setAreaCode("385"));
	}
	
	public static void provision()
	{
		clientFactory.getNumberClient().provision(new ProvisionRequest().setAreaCode("385").setFriendlyName("account(1234)"));
	}
	
	public static void get()
	{
		clientFactory.getNumberClient().get("");
	}
	
	public static void delete()
	{
		clientFactory.getNumberClient().delete("");
	}
	
}
