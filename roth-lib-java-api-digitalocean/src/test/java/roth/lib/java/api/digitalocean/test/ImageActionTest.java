package roth.lib.java.api.digitalocean.test;

import roth.lib.java.api.digitalocean.type.RegionType;

public class ImageActionTest extends Test
{
	
	public static void main(String[] args) throws Exception
	{
		//transferImage();
		//getImageAction();
	}
	
	public static void transferImage()
	{
		clientFactory.getImageActionClient().transferImage(4707226, RegionType.NEW_YORK_1);
	}
	
	public static void getImageAction()
	{
		clientFactory.getImageActionClient().getImageAction(4707226, 123);
	}
	
}
