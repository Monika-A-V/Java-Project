package com.FileHandling.DesignPattern;

public abstract class ElectricityPlan
{
	protected double rate;
	abstract void getRate();
	public void calculateBill(float units)
	{
		System.out.println("total bill :" +(rate*units));
	}

}
