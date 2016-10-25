package roth.lib.java.api.twilio.test;

public class LookupTest extends Test
{
	
	public static void main(String[] args)
	{
		//lookup();
		lookupCarrier();
		//lookupCallerName();
	}
	
	public static void lookup()
	{
		clientFactory.getLookupClient().lookup("2106461221");
	}
	
	public static void lookupCarrier()
	{
		clientFactory.getLookupClient().lookupCarrier("3852094060");
	}
	
	public static void lookupCallerName()
	{
		clientFactory.getLookupClient().lookupCallerName("3852094060");
	}
	
}
