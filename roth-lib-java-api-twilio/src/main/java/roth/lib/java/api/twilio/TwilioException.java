package roth.lib.java.api.twilio;

@SuppressWarnings("serial")
public class TwilioException extends RuntimeException
{
	protected Integer code;
	
	public TwilioException(String message)
	{
		super(message);
	}
	
	public TwilioException(Integer code, String message)
	{
		super(message);
		this.code = code;
	}
	
	public TwilioException(Throwable cause)
	{
		super(cause);
	}
	
	public TwilioException(String message, Throwable cause)
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
