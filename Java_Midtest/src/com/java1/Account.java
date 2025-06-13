package com.java1;

class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String balance)
	{
		super(balance);
	}
}
public class Account {

			int id;
			String name;
			int balance=100000;
			
			Account(int id,String name,int balance)
			{
				this.id=id;
				this.name=name;
				this.balance=balance;
			}

			public Account() {
			}

			public String toString()
			{
				return +id+" "+name+" "+balance;
			}
			public void deposit(double amount)
			{
				balance=(int) (balance+amount);
			}
			public void withdraw(double amount) throws InsufficientBalanceException
			{
				if(amount>balance)
				{
					throw new InsufficientBalanceException("amount should be less than balance");
				}
				else
					balance=(int) (balance-amount);
				
			}
		
public static void main(String[] args)
{
	Account a = new Account();
    System.out.println("Initial balance: " + a.balance);
    try
    {
        a.withdraw(200000);
        System.out.println("Withdrawal successful. New balance: " + a.balance);
    } 
    catch (InsufficientBalanceException e)
    {
        System.out.println("Withdrawal failed: " + e.getMessage());
    }}}
