package com.ClassAndObject;

class EncapsulationDemo
{
    private String name;
    private String accountNumber;
    private double balance;

    public void setName(String name)
    {
    	this.name=name;
    }
    public void setAccountNumber(String a)
    {
    	this.accountNumber=a;
    }
    public void setBalance(double b)
    {
    	this.balance=b;
    }

     public String getName()
    {
        return name;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance() 
    {
        return balance;
    }

	public static void main(String[] args)
	
	{
		EncapsulationDemo b = new EncapsulationDemo();
		b.setName("mona");
		b.setAccountNumber("1234567856");
		b.setBalance(100000);
		
		System.out.println(b.getName()+" "+b.getAccountNumber()+" "+b.getBalance());
	}

}
