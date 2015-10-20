package roth.lib.java.api.linode;

@SuppressWarnings("serial")
public class LinodeException extends RuntimeException
{
	
	public LinodeException(String message)
	{
		super(message);
	}
	
	public LinodeException(Throwable cause)
	{
		super(cause);
	}
	
	public LinodeException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
}
