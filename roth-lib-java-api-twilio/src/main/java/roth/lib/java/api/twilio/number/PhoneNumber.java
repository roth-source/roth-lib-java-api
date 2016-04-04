package roth.lib.java.api.twilio.number;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.TwilioResponse;
import roth.lib.java.http.HttpMethod;
import roth.lib.java.time.Time;

@Entity
@SuppressWarnings("serial")
public class PhoneNumber extends TwilioResponse
{
	@Property(name = "sid")
	protected String sid;
	
	@Property(name = "friendly_name")
	protected String friendlyName;
	
	@Property(name = "phone_number")
	protected String phoneNumber;
	
	@Property(name = "voice_url")
	protected String voiceUrl;
	
	@Property(name = "voice_method")
	protected HttpMethod voiceMethod;
	
	@Property(name = "voice_fallback_url")
	protected String voiceFallbackUrl;
	
	@Property(name = "voice_fallback_method")
	protected HttpMethod voiceFallbackMethod;
	
	@Property(name = "voice_caller_id_lookup")
	protected String voice_caller_id_lookup;
	
	@Property(name = "voice_application_sid")
	protected String voice_application_sid;
	
	@Property(name = "date_created", timeFormat = TIME_FORMAT)
	protected Time dateCreated;
	
	@Property(name = "date_updated", timeFormat = TIME_FORMAT)
	protected Time dateUpdated;
	
	@Property(name = "sms_url")
	protected String smsUrl;
	
	@Property(name = "sms_method")
	protected String smsMethod;
	
	@Property(name = "sms_fallback_url")
	protected String smsFallbackUrl;
	
	@Property(name = "sms_fallback_method")
	protected HttpMethod smsFallbackMethod;
	
	@Property(name = "sms_application_sid")
	protected String smsApplicationSid;
	
	@Property(name = "status_callback")
	protected String statusCallback;
	
	@Property(name = "uri")
	protected String uri;
	
	@Property(name = "capabilities")
	protected Capabilities capabilities;
	
	public PhoneNumber()
	{
		
	}

	public String getSid()
	{
		return sid;
	}

	public String getFriendlyName()
	{
		return friendlyName;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public String getVoiceUrl()
	{
		return voiceUrl;
	}

	public HttpMethod getVoiceMethod()
	{
		return voiceMethod;
	}

	public String getVoiceFallbackUrl()
	{
		return voiceFallbackUrl;
	}

	public HttpMethod getVoiceFallbackMethod()
	{
		return voiceFallbackMethod;
	}

	public String getVoice_caller_id_lookup()
	{
		return voice_caller_id_lookup;
	}

	public String getVoice_application_sid()
	{
		return voice_application_sid;
	}

	public Time getDateCreated()
	{
		return dateCreated;
	}

	public Time getDateUpdated()
	{
		return dateUpdated;
	}

	public String getSmsUrl()
	{
		return smsUrl;
	}

	public String getSmsMethod()
	{
		return smsMethod;
	}

	public String getSmsFallbackUrl()
	{
		return smsFallbackUrl;
	}

	public HttpMethod getSmsFallbackMethod()
	{
		return smsFallbackMethod;
	}

	public String getSmsApplicationSid()
	{
		return smsApplicationSid;
	}

	public String getStatusCallback()
	{
		return statusCallback;
	}

	public String getUri()
	{
		return uri;
	}

	public Capabilities getCapabilities()
	{
		return capabilities;
	}

	public PhoneNumber setSid(String sid)
	{
		this.sid = sid;
		return this;
	}

	public PhoneNumber setFriendlyName(String friendlyName)
	{
		this.friendlyName = friendlyName;
		return this;
	}

	public PhoneNumber setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
		return this;
	}

	public PhoneNumber setVoiceUrl(String voiceUrl)
	{
		this.voiceUrl = voiceUrl;
		return this;
	}

	public PhoneNumber setVoiceMethod(HttpMethod voiceMethod)
	{
		this.voiceMethod = voiceMethod;
		return this;
	}

	public PhoneNumber setVoiceFallbackUrl(String voiceFallbackUrl)
	{
		this.voiceFallbackUrl = voiceFallbackUrl;
		return this;
	}

	public PhoneNumber setVoiceFallbackMethod(HttpMethod voiceFallbackMethod)
	{
		this.voiceFallbackMethod = voiceFallbackMethod;
		return this;
	}

	public PhoneNumber setVoice_caller_id_lookup(String voice_caller_id_lookup)
	{
		this.voice_caller_id_lookup = voice_caller_id_lookup;
		return this;
	}

	public PhoneNumber setVoice_application_sid(String voice_application_sid)
	{
		this.voice_application_sid = voice_application_sid;
		return this;
	}

	public PhoneNumber setDateCreated(Time dateCreated)
	{
		this.dateCreated = dateCreated;
		return this;
	}

	public PhoneNumber setDateUpdated(Time dateUpdated)
	{
		this.dateUpdated = dateUpdated;
		return this;
	}

	public PhoneNumber setSmsUrl(String smsUrl)
	{
		this.smsUrl = smsUrl;
		return this;
	}

	public PhoneNumber setSmsMethod(String smsMethod)
	{
		this.smsMethod = smsMethod;
		return this;
	}

	public PhoneNumber setSmsFallbackUrl(String smsFallbackUrl)
	{
		this.smsFallbackUrl = smsFallbackUrl;
		return this;
	}

	public PhoneNumber setSmsFallbackMethod(HttpMethod smsFallbackMethod)
	{
		this.smsFallbackMethod = smsFallbackMethod;
		return this;
	}

	public PhoneNumber setSmsApplicationSid(String smsApplicationSid)
	{
		this.smsApplicationSid = smsApplicationSid;
		return this;
	}

	public PhoneNumber setStatusCallback(String statusCallback)
	{
		this.statusCallback = statusCallback;
		return this;
	}

	public PhoneNumber setUri(String uri)
	{
		this.uri = uri;
		return this;
	}

	public PhoneNumber setCapabilities(Capabilities capabilities)
	{
		this.capabilities = capabilities;
		return this;
	}
	
}
