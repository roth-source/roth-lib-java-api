package roth.lib.java.api.twilio;

@SuppressWarnings("serial")
public class TwilioStopException extends RuntimeException
{
	protected Integer code;
	
	public TwilioStopException(Integer code, String message)
	{
		super(message);
		this.code = code;
	}
	
	public TwilioStopException(Throwable cause)
	{
		super(cause);
	}
	
	public TwilioStopException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public Integer getCode()
	{
		return code;
	}
	
	public void setCode(Integer code)
	{
		this.code = code;
	}
	
}
