package roth.lib.java.api.linode.data.response;

import java.io.Serializable;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;

@Entity
@SuppressWarnings("serial")
public class NodeJobIdResponse implements Serializable
{
	@Property(name = "JobID")
	protected Integer jobId;
	
	public NodeJobIdResponse()
	{
		
	}
	
	public Integer getJobId()
	{
		return jobId;
	}
	
	public NodeJobIdResponse setJobId(Integer jobId)
	{
		this.jobId = jobId;
		return this;
	}
	
}
