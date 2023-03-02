package com.CoreJava_Day3;

public class Account
{

	private int accno;
	protected String name;
	private float balance;
	
	public void openAccount()
	{
		fillCustomerDetails(12345,"ravi",200000);
	}
	private void fillCustomerDetails(int a,String n,float b)
	{
		accno=a;
		name=n;
		balance=b;
	}
	void showAccountDetails()
	{
		System.out.println("account number "+accno);
		System.out.println("name is "+name);
		System.out.println("balance is "+balance);
	}
}
