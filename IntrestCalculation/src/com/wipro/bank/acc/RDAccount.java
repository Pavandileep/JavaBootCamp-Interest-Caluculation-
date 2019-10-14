package com.wipro.bank.acc;


public class RDAccount extends Account
{
	
	public RDAccount(int tenure, float principal)
	{
		this.tenure=tenure;
		this.principal=principal;
	}
	public float calculateAmountDeposited()
	{
		return principal*tenure*12;
	}
		
	public float calculateInterest() 
	{
		float p,r;
		p=principal;
		r=rateOfInterest/100;
		int n=4;
		float interest=0.0f;
		int t;
		int tn=12*tenure;
		for(t=0;t<tn;t++)
		{
			interest+=p*(float)(Math.pow(1+(r/n),n*((tn-t)/12.0))- 1);
		}
		
		return interest;
	}
}
