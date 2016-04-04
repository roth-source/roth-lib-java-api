package roth.lib.java.api.twilio.number;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.TwilioResponse;

@Entity
@SuppressWarnings("serial")
public class Capabilities extends TwilioResponse
{
	@Property(name = "SMS")
	protected boolean sms;
	
	@Property(name = "MMS")
	protected boolean mms;
	
	@Property(name = "voice")
	protected boolean voice;
	
	public Capabilities()
	{
		
	}
	
	public boolean isSms()
	{
		return sms;
	}
	
	public boolean isMms()
	{
		return mms;
	}
	
	public boolean isVoice()
	{
		return voice;
	}
	
	public Capabilities setSms(boolean sms)
	{
		this.sms = sms;
		return this;
	}
	
	public Capabilities setMms(boolean mms)
	{
		this.mms = mms;
		return this;
	}
	
	public Capabilities setVoice(boolean voice)
	{
		this.voice = voice;
		return this;
	}
	
}
