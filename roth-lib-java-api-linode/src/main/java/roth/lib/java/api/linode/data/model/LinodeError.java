package roth.lib.java.api.linode.data.model;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class LinodeError implements LinodeConstants
{
	@Property(name = "ERRORCODE")
	protected Integer errorCode;
	
	@Property(name = "ERRORMESSAGE")
	protected String errorMessage;
	
	public LinodeError()
	{
		
	}
	
	public Integer getErrorCode()
	{
		return errorCode;
	}
	
	public String getErrorMessage()
	{
		return errorMessage;
	}
	
	public LinodeError setErrorCode(Integer errorCode)
	{
		this.errorCode = errorCode;
		return this;
	}
	
	public LinodeError setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
		return this;
	}
	
}
