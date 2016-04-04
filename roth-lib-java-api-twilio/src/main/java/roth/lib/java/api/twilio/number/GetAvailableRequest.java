package roth.lib.java.api.twilio.number;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.TwilioConstants;

@Entity
@SuppressWarnings("serial")
public class GetAvailableRequest implements TwilioConstants
{
	@Property(name = "AreaCode")
	protected String areaCode;
	
	@Property(name = "Contains")
	protected String contains;
	
	@Property(name = "SmsEnabled")
	protected boolean smsEnabled = true;
	
	@Property(name = "MmsEnabled")
	protected boolean mmsEnabled = true;
	
	@Property(name = "VoiceEnabled")
	protected boolean voiceEnabled = true;
	
	@Property(name = "ExcludeAllAddressRequired")
	protected Boolean excludeAllAddressRequired;
	
	@Property(name = "ExcludeLocalAddressRequired")
	protected Boolean excludeLocalAddressRequired;
	
	@Property(name = "ExcludeForeignAddressRequired")
	protected Boolean ExcludeForeignAddressRequired;
	
	@Property(name = "Beta")
	protected Boolean beta;
	
	public GetAvailableRequest()
	{
		
	}
	
	public String getAreaCode()
	{
		return areaCode;
	}
	
	public String getContains()
	{
		return contains;
	}
	
	public boolean isSmsEnabled()
	{
		return smsEnabled;
	}
	
	public boolean isMmsEnabled()
	{
		return mmsEnabled;
	}
	
	public boolean isVoiceEnabled()
	{
		return voiceEnabled;
	}
	
	public Boolean getExcludeAllAddressRequired()
	{
		return excludeAllAddressRequired;
	}
	
	public Boolean getExcludeLocalAddressRequired()
	{
		return excludeLocalAddressRequired;
	}
	
	public Boolean getExcludeForeignAddressRequired()
	{
		return ExcludeForeignAddressRequired;
	}
	
	public Boolean getBeta()
	{
		return beta;
	}
	
	public GetAvailableRequest setAreaCode(String areaCode)
	{
		this.areaCode = areaCode;
		return this;
	}
	
	public GetAvailableRequest setContains(String contains)
	{
		this.contains = contains;
		return this;
	}
	
	public GetAvailableRequest setSmsEnabled(boolean smsEnabled)
	{
		this.smsEnabled = smsEnabled;
		return this;
	}
	
	public GetAvailableRequest setMmsEnabled(boolean mmsEnabled)
	{
		this.mmsEnabled = mmsEnabled;
		return this;
	}
	
	public GetAvailableRequest setVoiceEnabled(boolean voiceEnabled)
	{
		this.voiceEnabled = voiceEnabled;
		return this;
	}
	
	public GetAvailableRequest setExcludeAllAddressRequired(Boolean excludeAllAddressRequired)
	{
		this.excludeAllAddressRequired = excludeAllAddressRequired;
		return this;
	}
	
	public GetAvailableRequest setExcludeLocalAddressRequired(Boolean excludeLocalAddressRequired)
	{
		this.excludeLocalAddressRequired = excludeLocalAddressRequired;
		return this;
	}
	
	public GetAvailableRequest setExcludeForeignAddressRequired(Boolean excludeForeignAddressRequired)
	{
		ExcludeForeignAddressRequired = excludeForeignAddressRequired;
		return this;
	}
	
	public GetAvailableRequest setBeta(Boolean beta)
	{
		this.beta = beta;
		return this;
	}
	
}
