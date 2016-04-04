package roth.lib.java.api.twilio.number;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.twilio.TwilioResponse;
import roth.lib.java.lang.List;

@Entity
@SuppressWarnings("serial")
public class PhoneNumbersResponse extends TwilioResponse
{
	@Property(name = "page")
	protected int page;
	
	@Property(name = "page_size")
	protected int pageSize;
	
	@Property(name = "uri")
	protected String uri;
	
	@Property(name = "first_page_uri")
	protected String firstPageUri;
	
	@Property(name = "previous_page_uri")
	protected String previousPageUri;
	
	@Property(name = "next_page_uri")
	protected String nextPageUri;
	
	@Property(name = "incoming_phone_numbers")
	protected List<PhoneNumber> phoneNumbers = new List<>();
	
	public PhoneNumbersResponse()
	{
		
	}

	public int getPage()
	{
		return page;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public String getUri()
	{
		return uri;
	}

	public String getFirstPageUri()
	{
		return firstPageUri;
	}

	public String getPreviousPageUri()
	{
		return previousPageUri;
	}

	public String getNextPageUri()
	{
		return nextPageUri;
	}

	public List<PhoneNumber> getPhoneNumbers()
	{
		return phoneNumbers;
	}

	public PhoneNumbersResponse setPage(int page)
	{
		this.page = page;
		return this;
	}

	public PhoneNumbersResponse setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
		return this;
	}

	public PhoneNumbersResponse setUri(String uri)
	{
		this.uri = uri;
		return this;
	}

	public PhoneNumbersResponse setFirstPageUri(String firstPageUri)
	{
		this.firstPageUri = firstPageUri;
		return this;
	}

	public PhoneNumbersResponse setPreviousPageUri(String previousPageUri)
	{
		this.previousPageUri = previousPageUri;
		return this;
	}

	public PhoneNumbersResponse setNextPageUri(String nextPageUri)
	{
		this.nextPageUri = nextPageUri;
		return this;
	}

	public PhoneNumbersResponse setPhoneNumbers(List<PhoneNumber> phoneNumbers)
	{
		this.phoneNumbers = phoneNumbers;
		return this;
	}
	
}
