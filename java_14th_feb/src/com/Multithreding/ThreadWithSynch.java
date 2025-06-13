package com.Multithreding;


class Mytable
{
	synchronized void printable(int n) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+ "X" +i+ "=" +(n*1));
			Thread.sleep(500);
		}
	}
}
public class ThreadWithSynch {

	public static void main(String[] args) 
	{
		Mytable t=new Mytable();
		Thread t1 = new Thread()
		{
	       public void run()
	       {
	    	   try {
				t.printable(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	       }
	
		};
		
Thread t2 = new Thread()
		{
	       public void run()
	       {
	    	   try {
				t.printable(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	       }
	
		};

t1.start();
t2.start();

	}

}
