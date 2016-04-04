package roth.lib.java.api.amazon;

import roth.lib.java.http.HttpStatus;

@SuppressWarnings("serial")
public class AmazonException extends RuntimeException
{
	protected HttpStatus status;
	
	public AmazonException(HttpStatus status)
	{
		super(status.toString());
		this.status = status;
	}
	
	public AmazonException(String message)
	{
		super(message);
	}
	
	public AmazonException(Throwable cause)
	{
		super(cause);
	}
	
	public AmazonException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	public HttpStatus getStatus()
	{
		return status;
	}
	
}
