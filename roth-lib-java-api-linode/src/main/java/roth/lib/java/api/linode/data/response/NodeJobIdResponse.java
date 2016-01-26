package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class NodeJobIdResponse implements LinodeConstants
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
