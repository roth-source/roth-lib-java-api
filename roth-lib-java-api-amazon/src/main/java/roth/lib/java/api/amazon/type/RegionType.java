package roth.lib.java.api.amazon.type;

public enum RegionType
{
	US_EAST_1,
	US_WEST_1,
	US_WEST_2,
	EU_WEST_1,
	EU_CENTRAL_1,
	AP_NORTHEAST_1,
	AP_NORTHEAST_2,
	AP_SOUTHEAST_1,
	AP_SOUTHEAST_2,
	SA_EAST_1,
	;
	
	
	@Override
	public String toString()
	{
		return name().replaceAll("_", "-").toLowerCase();
	}
	
	public static RegionType fromString(String name)
	{
		RegionType regionType = null;
		try
		{
			regionType = RegionType.valueOf(name.replaceAll("-", "_").toUpperCase());
		}
		catch(Exception e)
		{
			
		}
		return regionType;
	}
	
}
