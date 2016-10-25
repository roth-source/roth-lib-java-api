package roth.lib.java.api.twilio.lookup;

import java.io.Serializable;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;

@Entity
@SuppressWarnings("serial")
public class CallerName implements Serializable
{
	@Property(name = "error_code")
	protected String errorCode;
	
	@Property(name = "caller_name")
	protected String callerName;
	
	@Property(name = "caller_type")
	protected String callerType;
	
	public CallerName()
	{
		
	}
	
	public String getErrorCode()
	{
		return errorCode;
	}
	
	public String getCallerName()
	{
		return callerName;
	}
	
	public String getCallerType()
	{
		return callerType;
	}
	
	public CallerName setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
		return this;
	}
	
	public CallerName setCallerName(String callerName)
	{
		this.callerName = callerName;
		return this;
	}
	
	public CallerName setCallerType(String callerType)
	{
		this.callerType = callerType;
		return this;
	}
	
}
