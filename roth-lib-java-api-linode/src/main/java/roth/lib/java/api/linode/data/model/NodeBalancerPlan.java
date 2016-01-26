package roth.lib.java.api.linode.data.model;

import java.math.BigDecimal;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.api.linode.LinodeConstants;

@Entity
@SuppressWarnings("serial")
public class NodeBalancerPlan implements LinodeConstants
{
	@Property(name = "MONTHLY")
	protected BigDecimal monthly;
	
	@Property(name = "HOURLY")
	protected BigDecimal hourly;
	
	@Property(name = "CONNECTIONS")
	protected Integer connections;
	
	public NodeBalancerPlan()
	{
		
	}
	
	public BigDecimal getMonthly()
	{
		return monthly;
	}
	
	public BigDecimal getHourly()
	{
		return hourly;
	}
	
	public Integer getConnections()
	{
		return connections;
	}
	
	public NodeBalancerPlan setMonthly(BigDecimal monthly)
	{
		this.monthly = monthly;
		return this;
	}
	
	public NodeBalancerPlan setHourly(BigDecimal hourly)
	{
		this.hourly = hourly;
		return this;
	}
	
	public NodeBalancerPlan setConnections(Integer connections)
	{
		this.connections = connections;
		return this;
	}
	
}
