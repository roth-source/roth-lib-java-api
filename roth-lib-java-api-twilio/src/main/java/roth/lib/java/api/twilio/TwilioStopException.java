package roth.lib.java.api.twilio;

@SuppressWarnings("serial")
public class TwilioStopException extends RuntimeException
{
	
	public TwilioStopException(String message)
	{
		super(message);
	}
	
	public TwilioStopException(Throwable cause)
	{
		super(cause);
	}
	
	public TwilioStopException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
}
