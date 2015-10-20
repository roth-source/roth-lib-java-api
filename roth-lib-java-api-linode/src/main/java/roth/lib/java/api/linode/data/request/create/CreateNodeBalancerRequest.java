package roth.lib.java.api.linode.data.request.create;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.data.request.NodeBalancerRequest;
import roth.lib.java.api.linode.data.type.PaymentTermType;

@Entity
@SuppressWarnings("serial")
public class CreateNodeBalancerRequest extends NodeBalancerRequest
{
	@Property(name = "DatacenterID")
	protected Integer datacenterId;
	
	@Property(name = "PaymentTerm")
	protected Integer paymentTerm;
	
	public CreateNodeBalancerRequest(Integer datacenterId)
	{
		super();
		setDatacenterId(datacenterId);
	}
	
	public Integer getDatacenterId()
	{
		return datacenterId;
	}
	
	public Integer getPaymentTerm()
	{
		return paymentTerm;
	}
	
	public CreateNodeBalancerRequest setDatacenterId(Integer datacenterId)
	{
		this.datacenterId = datacenterId;
		return this;
	}
	
	public CreateNodeBalancerRequest setPaymentTerm(Integer paymentTerm)
	{
		this.paymentTerm = paymentTerm;
		return this;
	}
	
	public CreateNodeBalancerRequest setPaymentTerm(PaymentTermType paymentTermType)
	{
		this.paymentTerm = paymentTermType.get();
		return this;
	}
	
}
