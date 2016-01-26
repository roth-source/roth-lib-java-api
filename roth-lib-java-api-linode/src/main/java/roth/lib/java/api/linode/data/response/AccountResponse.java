package roth.lib.java.api.linode.data.response;

import java.math.BigDecimal;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;
import roth.lib.java.time.Time;

@Entity
@SuppressWarnings("serial")
public class AccountResponse implements LinodeConstants
{
	@Property(name = "ACTIVE_SINCE", timeFormat = TIME_FORMAT)
	protected Time activeSince;
	
	@Property(name = "TRANSFER_POOL")
	protected Integer transferPool;
	
	@Property(name = "TRANSFER_USED")
	protected Integer transferUsed;
	
	@Property(name = "TRANSFER_BILLABLE")
	protected Integer transferBillable;
	
	@Property(name = "MANAGED")
	protected Boolean managed;
	
	@Property(name = "BALANCE")
	protected BigDecimal balance;
	
	public AccountResponse()
	{
		
	}
	
	public Time getActiveSince()
	{
		return activeSince;
	}
	
	public Integer getTransferPool()
	{
		return transferPool;
	}
	
	public Integer getTransferUsed()
	{
		return transferUsed;
	}
	
	public Integer getTransferBillable()
	{
		return transferBillable;
	}
	
	public Boolean getManaged()
	{
		return managed;
	}
	
	public BigDecimal getBalance()
	{
		return balance;
	}
	
	public AccountResponse setActiveSince(Time activeSince)
	{
		this.activeSince = activeSince;
		return this;
	}
	
	public AccountResponse setTransferPool(Integer transferPool)
	{
		this.transferPool = transferPool;
		return this;
	}
	
	public AccountResponse setTransferUsed(Integer transferUsed)
	{
		this.transferUsed = transferUsed;
		return this;
	}
	
	public AccountResponse setTransferBillable(Integer transferBillable)
	{
		this.transferBillable = transferBillable;
		return this;
	}
	
	public AccountResponse setManaged(Boolean managed)
	{
		this.managed = managed;
		return this;
	}
	
	public AccountResponse setBalance(BigDecimal balance)
	{
		this.balance = balance;
		return this;
	}
	
}
