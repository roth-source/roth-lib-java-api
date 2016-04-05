package roth.lib.java.api.amazon.test;

import java.io.File;

import roth.lib.java.api.amazon.type.RegionType;
import roth.lib.java.type.MimeType;
import roth.lib.java.util.IoUtil;

public class S3Test extends Test
{

	public static void main(String[] args) throws Exception
	{
		//hasObject();
		//getObject();
		putObject();
	}
	
	public static void hasObject() throws Exception
	{
		boolean has = clientFactory.getS3Client().hasObject(RegionType.US_WEST_2, "aptexxtestupload", "test9.txt");
		System.out.println(has);
	}
	
	public static void getObject() throws Exception
	{
		String response = IoUtil.toString(clientFactory.getS3Client().getObject(RegionType.US_WEST_2, "aptexxtestupload", "test4.txt"));
		System.out.println(response);
	}
	
	public static void putObject() throws Exception
	{
		//File file = new File("dev/test.txt");
		File file = new File("/Users/User/Downloads/test.txt");
		clientFactory.getS3Client().putObject(RegionType.US_EAST_1, "aptexxappdata", "TEMP/test test.txt", MimeType.TEXT_PLAIN, file);
		//clientFactory.getS3Client().putObject(RegionType.US_WEST_2, "aptexxtestupload", "test9.txt", MimeType.TEXT_PLAIN, FileUtil.toBytes(file));
	}
	
}
