package roth.lib.java.api.twilio.message;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.TwilioResponse;
import roth.lib.java.time.Time;

@Entity
@SuppressWarnings("serial")
public class SendMessageResponse extends TwilioResponse
{
	@Property(name = "sid")
	protected String sid;
	
	@Property(name = "date_created", timeFormat = TIME_FORMAT)
	protected Time dateCreated;
	
	@Property(name = "date_updated", timeFormat = TIME_FORMAT)
	protected Time dateUpdated;
	
	@Property(name = "date_sent", timeFormat = TIME_FORMAT)
	protected Time dateSent;
	
	@Property(name = "to")
	protected String to;
	
	@Property(name = "from")
	protected String from;
	
	@Property(name = "body")
	protected String body;
	
	@Property(name = "status")
	protected String status;
	
	@Property(name = "num_segments")
	protected Integer numSegments;
	
	@Property(name = "num_media")
	protected Integer numMedia;
	
	@Property(name = "direction")
	protected String direction;
	
	@Property(name = "price")
	protected String price;
	
	@Property(name = "price_unit")
	protected String priceUnit;
	
	@Property(name = "uri")
	protected String uri;
	
	public SendMessageResponse()
	{
		
	}
	
	public String getSid()
	{
		return sid;
	}
	
	public Time getDateCreated()
	{
		return dateCreated;
	}
	
	public Time getDateUpdated()
	{
		return dateUpdated;
	}
	
	public Time getDateSent()
	{
		return dateSent;
	}
	
	public String getTo()
	{
		return to;
	}
	
	public String getFrom()
	{
		return from;
	}
	
	public String getBody()
	{
		return body;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public Integer getNumSegments()
	{
		return numSegments;
	}
	
	public Integer getNumMedia()
	{
		return numMedia;
	}
	
	public String getDirection()
	{
		return direction;
	}
	
	public String getPrice()
	{
		return price;
	}
	
	public String getPriceUnit()
	{
		return priceUnit;
	}
	
	public String getUri()
	{
		return uri;
	}
	
	public SendMessageResponse setSid(String sid)
	{
		this.sid = sid;
		return this;
	}
	
	public SendMessageResponse setDateCreated(Time dateCreated)
	{
		this.dateCreated = dateCreated;
		return this;
	}
	
	public SendMessageResponse setDateUpdated(Time dateUpdated)
	{
		this.dateUpdated = dateUpdated;
		return this;
	}
	
	public SendMessageResponse setDateSent(Time dateSent)
	{
		this.dateSent = dateSent;
		return this;
	}
	
	public SendMessageResponse setTo(String to)
	{
		this.to = to;
		return this;
	}
	
	public SendMessageResponse setFrom(String from)
	{
		this.from = from;
		return this;
	}
	
	public SendMessageResponse setBody(String body)
	{
		this.body = body;
		return this;
	}
	
	public SendMessageResponse setStatus(String status)
	{
		this.status = status;
		return this;
	}
	
	public SendMessageResponse setNumSegments(Integer numSegments)
	{
		this.numSegments = numSegments;
		return this;
	}
	
	public SendMessageResponse setNumMedia(Integer numMedia)
	{
		this.numMedia = numMedia;
		return this;
	}
	
	public SendMessageResponse setDirection(String direction)
	{
		this.direction = direction;
		return this;
	}
	
	public SendMessageResponse setPrice(String price)
	{
		this.price = price;
		return this;
	}
	
	public SendMessageResponse setPriceUnit(String priceUnit)
	{
		this.priceUnit = priceUnit;
		return this;
	}
	
	public SendMessageResponse setUri(String uri)
	{
		this.uri = uri;
		return this;
	}
	
}