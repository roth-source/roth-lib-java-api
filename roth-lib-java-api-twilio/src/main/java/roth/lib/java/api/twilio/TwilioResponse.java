package roth.lib.java.api.twilio;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;

@Entity
@SuppressWarnings("serial")
public class TwilioResponse implements TwilioConstants
{
	@Property(name = "account_sid")
	protected String accountSid;
	
	@Property(name = "api_version")
	protected String apiVersion;
	
	@Property(name = "code")
	protected Integer errorCode;
	
	@Property(name = "message")
	protected String errorMessage;
	
	public TwilioResponse()
	{
		
	}
	
	public String getAccountSid()
	{
		return accountSid;
	}
	
	public String getApiVersion()
	{
		return apiVersion;
	}
	
	public Integer getErrorCode()
	{
		return errorCode;
	}
	
	public String getErrorMessage()
	{
		return errorMessage;
	}
	
	public TwilioResponse setAccountSid(String accountSid)
	{
		this.accountSid = accountSid;
		return this;
	}
	
	public TwilioResponse setApiVersion(String apiVersion)
	{
		this.apiVersion = apiVersion;
		return this;
	}
	
	public TwilioResponse setErrorCode(Integer errorCode)
	{
		this.errorCode = errorCode;
		return this;
	}
	
	public TwilioResponse setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
		return this;
	}
	
}
