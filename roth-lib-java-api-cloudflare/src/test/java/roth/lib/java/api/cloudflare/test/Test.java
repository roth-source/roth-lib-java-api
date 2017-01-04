package roth.lib.java.api.cloudflare.test;

import java.io.File;
import java.util.Properties;

import roth.lib.java.api.cloudflare.CloudFlareClientFactory;
import roth.lib.java.util.PropertiesUtil;


public class Test
{
	protected static Properties test = PropertiesUtil.load(new File("dev/test.properties"));
	protected static CloudFlareClientFactory clientFactory = CloudFlareClientFactory.get(test.getProperty("email"), test.getProperty("apiKey"), true);
	protected static String zoneId = test.getProperty("zoneId");
	
	public static void main(String[] args) throws Exception
	{
		
	}
	
}
