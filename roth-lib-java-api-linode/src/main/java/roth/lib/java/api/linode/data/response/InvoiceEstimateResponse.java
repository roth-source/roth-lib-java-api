package roth.lib.java.api.linode.data.response;

import java.math.BigDecimal;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;
import roth.lib.java.time.Time;

@Entity
@SuppressWarnings("serial")
public class InvoiceEstimateResponse implements LinodeConstants
{
	@Property(name = "INVOICE_TO", timeFormat = TIME_FORMAT)
	protected Time invoiceTo;
	
	@Property(name = "PRICE")
	protected BigDecimal price;
	
	public InvoiceEstimateResponse()
	{
		
	}
	
	public Time getInvoiceTo()
	{
		return invoiceTo;
	}
	
	public BigDecimal getPrice()
	{
		return price;
	}
	
	public InvoiceEstimateResponse setInvoiceTo(Time invoiceTo)
	{
		this.invoiceTo = invoiceTo;
		return this;
	}
	
	public InvoiceEstimateResponse setPrice(BigDecimal price)
	{
		this.price = price;
		return this;
	}
	
}
