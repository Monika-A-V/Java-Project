package com.ClassAndObject;

class Customer 
{
    private int id;
    private String name;
    private double prize;

    public Customer(int id, String name, double prize)
    {
        this.id = id;
        this.name = name;
        this.prize = prize;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getPrize() 
    {
        return prize;
    }

    public void setPrize(double prize)
    {
        this.prize = prize;
    }

    public boolean withdraw(double amount)
    {
        if (amount <= prize)
        {
            prize -= amount;
            Paytm.setBalance(Paytm.getBalance() - amount);
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Paytm 
{
    private static double balance = 5000;

    public static double getBalance() 
    {
        return balance;
    }

    public static void setBalance(double balance) 
    {
        Paytm.balance = balance;
    }
}
public class PaytmGetterSetter 
{

	public static void main(String[] args)
	{

		Customer customer = new Customer(1, "Pooja", 5000);
		double withdrawalAmount = 2000;
		
		if (customer.withdraw(withdrawalAmount)) 
		{
		    System.out.println("Withdrawal of " + withdrawalAmount + " successful");
		} 
		else 
		{
		    System.out.println("Insufficient prize");
		}
		
		System.out.println("Customer prize: " + customer.getPrize());
		System.out.println("Paytm balance: " + Paytm.getBalance());
	}

}
