package roth.lib.java.api.linode.data.response;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class StackScriptIdResponse implements LinodeConstants
{
	@Property(name = "StackScriptID")
	protected Integer stackScriptId;
	
	public StackScriptIdResponse()
	{
		
	}
	
	public Integer getStackScriptId()
	{
		return stackScriptId;
	}
	
	public StackScriptIdResponse setStackScriptId(Integer stackScriptId)
	{
		this.stackScriptId = stackScriptId;
		return this;
	}
	
}
