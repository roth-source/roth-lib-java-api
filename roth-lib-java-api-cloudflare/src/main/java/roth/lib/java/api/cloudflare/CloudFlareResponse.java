package roth.lib.java.api.cloudflare;

import java.io.Serializable;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.lang.List;

@Entity
@SuppressWarnings("serial")
public class CloudFlareResponse<T> implements Serializable
{
	@Property(name = "result")
	protected T result;
	
	@Property(name = "success")
	protected boolean success;
	
	@Property(name = "errors")
	protected List<CloudFlareError> errors = new List<>();
	
	@Property(name = "result_info")
	protected CloudFlareResultInfo resultInfo;
	
	public CloudFlareResponse()
	{
		
	}
	
	public T getResult()
	{
		return result;
	}
	
	public boolean isSuccess()
	{
		return success;
	}
	
	public List<CloudFlareError> getErrors()
	{
		return errors;
	}
	
	public CloudFlareResultInfo getResultInfo()
	{
		return resultInfo;
	}
	
}
