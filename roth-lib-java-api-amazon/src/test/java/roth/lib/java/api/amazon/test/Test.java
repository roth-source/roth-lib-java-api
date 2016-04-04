package roth.lib.java.api.amazon.test;

import java.io.File;
import java.util.Properties;

import roth.lib.java.api.amazon.AmazonClientFactory;
import roth.lib.java.util.PropertiesUtil;

public class Test
{
	protected static Properties test = PropertiesUtil.load(new File("dev/test.properties"));
	protected static AmazonClientFactory clientFactory = AmazonClientFactory.get(test.getProperty("accessKey"), test.getProperty("secretKey"), true);
	
	public static void main(String[] args) throws Exception
	{
		
	}
	
}
