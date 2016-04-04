package roth.lib.java.api.amazon;

import java.util.LinkedHashMap;

import roth.lib.java.api.amazon.s3.S3Client;

public class AmazonClientFactory
{
	protected static LinkedHashMap<String, AmazonClientFactory> instanceMap = new LinkedHashMap<String, AmazonClientFactory>();
	
	protected S3Client s3Client;
	
	protected AmazonClientFactory(String accessKey, String secretKey, boolean debug)
	{
		s3Client = new S3Client(accessKey, secretKey, debug);
	}
	
	public static AmazonClientFactory get(String accessKey, String secretKey)
	{
		return get(accessKey, secretKey, false);
	}
	
	public static AmazonClientFactory get(String accessKey, String secretKey, boolean debug)
	{
		AmazonClientFactory clientFactory = instanceMap.get(accessKey + ":" + secretKey);
		if(clientFactory == null)
		{
			clientFactory = new AmazonClientFactory(accessKey, secretKey, debug);
			instanceMap.put(accessKey + ":" + secretKey, clientFactory);
		}
		return clientFactory;
	}
	
	public static LinkedHashMap<String, AmazonClientFactory> getInstanceMap()
	{
		return instanceMap;
	}
	
	public S3Client getS3Client()
	{
		return s3Client;
	}
	
}
