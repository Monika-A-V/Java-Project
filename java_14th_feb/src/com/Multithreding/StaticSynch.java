package com.Multithreding;

class My1table
{
	synchronized static void printable(int n) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+ "X" +i+ "=" +(n*1));
			Thread.sleep(500);
		}
		System.out.println("Table :"+n +" is printed");
	}
}
public class StaticSynch {

	public static void main(String[] args) {

		My1table r1=new My1table();
		My1table r2=new My1table();

		 Thread t1= new Thread()
	     {
	    	 public void run()
	    	 {
	    		 try {
	    			 My1table.printable(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		 
	    	 }
	    	 
	     };
	     
	     Thread t2= new Thread()
	     {
	    	 public void run()
	    	 {
	    		 try {
					r1.printable(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		 
	    	 }
	    	 
	     };
	     
	     Thread t3= new Thread()
	     {
	    	 public void run()
	    	 {
	    		 try {
					r2.printable(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		 
	    	 }
	    	 
	     };

t1.start();
t2.start();
t3.start();
	}

}
