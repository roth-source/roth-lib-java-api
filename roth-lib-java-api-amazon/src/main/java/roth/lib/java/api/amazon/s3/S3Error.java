package roth.lib.java.api.amazon.s3;

import java.io.Serializable;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.amazon.type.RegionType;

@Entity(name = "Error")
@SuppressWarnings("serial")
public class S3Error implements Serializable
{
	@Property(name = "Code")
	protected String code;
	
	@Property(name = "Message")
	protected String message;
	
	@Property(name = "Region")
	protected RegionType regionType;
	
	@Property(name = "RequestId")
	protected String requestId;
	
	@Property(name = "HostId")
	protected String hostId;
	
	public S3Error()
	{
		
	}

	public String getCode()
	{
		return code;
	}

	public String getMessage()
	{
		return message;
	}

	public RegionType getRegionType()
	{
		return regionType;
	}

	public String getRequestId()
	{
		return requestId;
	}

	public String getHostId()
	{
		return hostId;
	}

	public S3Error setCode(String code)
	{
		this.code = code;
		return this;
	}

	public S3Error setMessage(String message)
	{
		this.message = message;
		return this;
	}

	public S3Error setRegionType(RegionType regionType)
	{
		this.regionType = regionType;
		return this;
	}

	public S3Error setRequestId(String requestId)
	{
		this.requestId = requestId;
		return this;
	}

	public S3Error setHostId(String hostId)
	{
		this.hostId = hostId;
		return this;
	}
	
}
