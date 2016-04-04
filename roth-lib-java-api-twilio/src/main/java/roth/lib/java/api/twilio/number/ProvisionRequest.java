package roth.lib.java.api.twilio.number;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.TwilioConstants;
import roth.lib.java.http.HttpMethod;

@Entity
@SuppressWarnings("serial")
public class ProvisionRequest implements TwilioConstants
{
	@Property(name = "AreaCode")
	protected String areaCode;
	
	@Property(name = "PhoneNumber")
	protected String phoneNumber;
	
	@Property(name = "FriendlyName")
	protected String friendlyName;
	
	@Property(name = "VoiceUrl")
	protected String voiceUrl;
	
	@Property(name = "VoiceMethod")
	protected HttpMethod voiceMethod;
	
	@Property(name = "VoiceFallbackUrl")
	protected String voiceFallbackUrl;
	
	@Property(name = "VoiceFallbackMethod")
	protected HttpMethod voiceFallbackMethod;
	
	@Property(name = "StatusCallback")
	protected String statusCallback;
	
	@Property(name = "StatusCallbackMethod")
	protected HttpMethod StatusCallbackMethod;
	
	@Property(name = "VoiceCallerIdLookup")
	protected Boolean voiceCallerIdLookup;
	
	@Property(name = "VoiceApplicationSid")
	protected String voiceApplicationSid;
	
	@Property(name = "TrunkSid")
	protected String trunkSid;
	
	@Property(name = "SmsUrl")
	protected String smsUrl;
	
	@Property(name = "SmsMethod")
	protected HttpMethod smsMethod;
	
	@Property(name = "SmsFallbackUrl")
	protected String smsFallbackUrl;
	
	@Property(name = "SmsFallbackMethod")
	protected HttpMethod smsFallbackMethod;
	
	@Property(name = "SmsApplicationSid")
	protected String smsApplicationSid;
	
	public ProvisionRequest()
	{
		
	}

	public String getAreaCode()
	{
		return areaCode;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public String getFriendlyName()
	{
		return friendlyName;
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

	public String getStatusCallback()
	{
		return statusCallback;
	}

	public HttpMethod getStatusCallbackMethod()
	{
		return StatusCallbackMethod;
	}

	public Boolean getVoiceCallerIdLookup()
	{
		return voiceCallerIdLookup;
	}

	public String getVoiceApplicationSid()
	{
		return voiceApplicationSid;
	}

	public String getTrunkSid()
	{
		return trunkSid;
	}

	public String getSmsUrl()
	{
		return smsUrl;
	}

	public HttpMethod getSmsMethod()
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

	public ProvisionRequest setAreaCode(String areaCode)
	{
		this.areaCode = areaCode;
		return this;
	}

	public ProvisionRequest setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
		return this;
	}

	public ProvisionRequest setFriendlyName(String friendlyName)
	{
		this.friendlyName = friendlyName;
		return this;
	}

	public ProvisionRequest setVoiceUrl(String voiceUrl)
	{
		this.voiceUrl = voiceUrl;
		return this;
	}

	public ProvisionRequest setVoiceMethod(HttpMethod voiceMethod)
	{
		this.voiceMethod = voiceMethod;
		return this;
	}

	public ProvisionRequest setVoiceFallbackUrl(String voiceFallbackUrl)
	{
		this.voiceFallbackUrl = voiceFallbackUrl;
		return this;
	}

	public ProvisionRequest setVoiceFallbackMethod(HttpMethod voiceFallbackMethod)
	{
		this.voiceFallbackMethod = voiceFallbackMethod;
		return this;
	}

	public ProvisionRequest setStatusCallback(String statusCallback)
	{
		this.statusCallback = statusCallback;
		return this;
	}

	public ProvisionRequest setStatusCallbackMethod(HttpMethod statusCallbackMethod)
	{
		StatusCallbackMethod = statusCallbackMethod;
		return this;
	}

	public ProvisionRequest setVoiceCallerIdLookup(Boolean voiceCallerIdLookup)
	{
		this.voiceCallerIdLookup = voiceCallerIdLookup;
		return this;
	}

	public ProvisionRequest setVoiceApplicationSid(String voiceApplicationSid)
	{
		this.voiceApplicationSid = voiceApplicationSid;
		return this;
	}

	public ProvisionRequest setTrunkSid(String trunkSid)
	{
		this.trunkSid = trunkSid;
		return this;
	}

	public ProvisionRequest setSmsUrl(String smsUrl)
	{
		this.smsUrl = smsUrl;
		return this;
	}

	public ProvisionRequest setSmsMethod(HttpMethod smsMethod)
	{
		this.smsMethod = smsMethod;
		return this;
	}

	public ProvisionRequest setSmsFallbackUrl(String smsFallbackUrl)
	{
		this.smsFallbackUrl = smsFallbackUrl;
		return this;
	}

	public ProvisionRequest setSmsFallbackMethod(HttpMethod smsFallbackMethod)
	{
		this.smsFallbackMethod = smsFallbackMethod;
		return this;
	}
	
	public ProvisionRequest setSmsApplicationSid(String smsApplicationSid)
	{
		this.smsApplicationSid = smsApplicationSid;
		return this;
	}
	
}
