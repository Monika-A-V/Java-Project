package com.FileHandling.DesignPattern;

public class GetPlanFactory
{
	public ElectricityPlan getPlan(String plantype)
	{
		if(plantype==null)
	     
			return null;
		
		else if(plantype.equalsIgnoreCase("domestic"))
		return new DomesticPlan();
		
		else if(plantype.equalsIgnoreCase("Commercial"))
			return new Commercial();
		
		else if(plantype.equalsIgnoreCase("ngo"))
			return new Ngo();
		
		
		return null;
		
		
	}

}
