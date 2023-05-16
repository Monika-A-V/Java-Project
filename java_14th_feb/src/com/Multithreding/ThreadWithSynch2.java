package com.Multithreding;

class MTable
{
	 void printTable(int n) throws InterruptedException
	{
		synchronized (this) {
			
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+"X"+i+"="+(n*i));
				Thread.sleep(500);
			}
			
		} 
		
		System.out.println("Table :"+n +" is printed");
		
	}

}
public class ThreadWithSynch2 {

	public static void main(String[] args) {

MTable t= new MTable();
		
		Thread t1 = new Thread()
				{
			       public void run()
			       {
			    	   try {
						t.printTable(2);
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
						t.printTable(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			       }
			
				};
		
		t1.start();
		t2.start();
	}

}
