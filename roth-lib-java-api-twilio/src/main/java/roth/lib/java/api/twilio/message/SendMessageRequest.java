package roth.lib.java.api.twilio.message;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.TwilioConstants;
import roth.lib.java.lang.List;

@Entity
@SuppressWarnings("serial")
public class SendMessageRequest implements TwilioConstants
{
	@Property(name = "From")
	protected String from;
	
	@Property(name = "To")
	protected String to;
	
	@Property(name = "Body")
	protected String body;
	
	@Property(name = "MediaUrl")
	protected List<String> mediaUrls = new List<>();
	
	@Property(name = "StatusCallback")
	protected String statusCallback;
	
	public SendMessageRequest(String from, String to, String body)
	{
		this.from = from;
		this.to = to;
		this.body = body;
	}
	
	public String getFrom()
	{
		return from;
	}
	
	public String getTo()
	{
		return to;
	}
	
	public String getBody()
	{
		return body;
	}
	
	public List<String> getMediaUrls()
	{
		return mediaUrls;
	}
	
	public String getStatusCallback()
	{
		return statusCallback;
	}
	
	public SendMessageRequest setFrom(String from)
	{
		this.from = from;
		return this;
	}
	
	public SendMessageRequest setTo(String to)
	{
		this.to = to;
		return this;
	}
	
	public SendMessageRequest setBody(String body)
	{
		this.body = body;
		return this;
	}
	
	public SendMessageRequest addMediaUrl(String mediaUrl)
	{
		this.mediaUrls.add(mediaUrl);
		return this;
	}
	
	public SendMessageRequest setMediaUrl(List<String> mediaUrls)
	{
		this.mediaUrls = mediaUrls;
		return this;
	}
	
	public SendMessageRequest setStatusCallback(String statusCallback)
	{
		this.statusCallback = statusCallback;
		return this;
	}
	
}
