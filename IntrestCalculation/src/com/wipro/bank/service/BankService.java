package com.wipro.bank.service;
import com.wipro.bank.exception.*;
import com.wipro.bank.acc.*;

public class BankService 
{
	public boolean validateData(float principal, int tenure, int age, String gender)
	{
		try
		{
			if((!(principal > 500))|| (tenure!=5 || tenure!=10) || (!(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))) || (!(age >=1 && age <= 100)))
				throw new BankValidationException();
			else
				return true;
		}
		catch(BankValidationException e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	public void calculate(float principal,int tenure, int age, String gender)
	{
		boolean check=validateData(principal,tenure,age,gender);
		if(check)
		{
			RDAccount rdaccount=new RDAccount(tenure,principal);
			rdaccount.setInterest(age, gender);
			System.out.println("Rate of interest is "+rdaccount.rateOfInterest);
			
			
			
			
			
		}
		
	}
	
}
