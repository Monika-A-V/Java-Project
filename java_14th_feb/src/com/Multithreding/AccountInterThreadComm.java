package com.Multithreding;


class Account
{
	int amount =1000;
	
	synchronized public  void withdraw(int amount)
	{
		System.out.println("Going to withdraw:"+amount);
		
		if((this.amount-amount)<100)
		{
			System.out.println("Insufficient Balance:"+this.amount);
			System.out.println("Waiting for deposit..........");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("-------------------------------------");
			if((this.amount-amount)<100)
			{
				withdraw(amount);
			}
			else
			{
				this.amount-=amount;
				System.out.println("withdraw successfull:"+amount);
				System.out.println("Balance :"+this.amount);
			}
			
		}
	}
	
	public synchronized void deposit(int amount)
	{
		System.out.println("--------------------------");
		System.out.println("Going to deposit:"+amount);
		this.amount+=amount;
		
		System.out.println("Balance:"+this.amount);
		notify();
	}
	

}
public class AccountInterThreadComm {

	public static void main(String[] args) {

		Account a1= new Account();
	    
	    Thread wife= new Thread()
	    		{
	    	     public void run()
	    	     {
	    	    	 a1.withdraw(2500);
	    	     }
	    	
	    		};
	    		
	    Thread husband= new Thread()
	    		{
	    	     public void run()
	    	     {
	    	    	 a1.deposit(5000);
	    	     }
	    	
	    		};	
	    		
	    wife.start();
	    husband.start();

		}
}