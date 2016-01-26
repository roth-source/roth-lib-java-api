package roth.lib.java.api.twilio.call;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.TwilioResponse;
import roth.lib.java.time.Time;

@Entity
@SuppressWarnings("serial")
public class MakeCallResponse extends TwilioResponse
{
	@Property(name = "sid")
	protected String sid;
	
	@Property(name = "parent_call_sid")
	protected String parentCallSid;
	
	@Property(name = "phone_number_sid")
	protected String phoneNumberSid;
	
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
	
	public MakeCallResponse()
	{
		
	}
	
	public String getSid()
	{
		return sid;
	}
	
	public String getParentCallSid()
	{
		return parentCallSid;
	}
	
	public String getPhoneNumberSid()
	{
		return phoneNumberSid;
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
	
	public MakeCallResponse setSid(String sid)
	{
		this.sid = sid;
		return this;
	}
	
	public MakeCallResponse setParentCallSid(String parentCallSid)
	{
		this.parentCallSid = parentCallSid;
		return this;
	}
	
	public MakeCallResponse setPhoneNumberSid(String phoneNumberSid)
	{
		this.phoneNumberSid = phoneNumberSid;
		return this;
	}
	
	public MakeCallResponse setDateCreated(Time dateCreated)
	{
		this.dateCreated = dateCreated;
		return this;
	}
	
	public MakeCallResponse setDateUpdated(Time dateUpdated)
	{
		this.dateUpdated = dateUpdated;
		return this;
	}
	
	public MakeCallResponse setDateSent(Time dateSent)
	{
		this.dateSent = dateSent;
		return this;
	}
	
	public MakeCallResponse setTo(String to)
	{
		this.to = to;
		return this;
	}
	
	public MakeCallResponse setFrom(String from)
	{
		this.from = from;
		return this;
	}
	
	public MakeCallResponse setBody(String body)
	{
		this.body = body;
		return this;
	}
	
	public MakeCallResponse setStatus(String status)
	{
		this.status = status;
		return this;
	}
	
	public MakeCallResponse setNumSegments(Integer numSegments)
	{
		this.numSegments = numSegments;
		return this;
	}
	
	public MakeCallResponse setNumMedia(Integer numMedia)
	{
		this.numMedia = numMedia;
		return this;
	}
	
	public MakeCallResponse setDirection(String direction)
	{
		this.direction = direction;
		return this;
	}
	
	public MakeCallResponse setPrice(String price)
	{
		this.price = price;
		return this;
	}
	
	public MakeCallResponse setPriceUnit(String priceUnit)
	{
		this.priceUnit = priceUnit;
		return this;
	}
	
	public MakeCallResponse setUri(String uri)
	{
		this.uri = uri;
		return this;
	}
	
}
