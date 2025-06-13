package com.Multithreding;

class SResource
{
   synchronized void methodOne(SResource r)
   {
	   System.out.println("Method 1:"+Thread.currentThread().getName()+" is acquired");
	   methodTwo(this);
	   System.out.println("Method 1:"+Thread.currentThread().getName()+" is released");
	   
   }
   
   synchronized void methodTwo(SResource r)
   {
	   System.out.println("Method 2:"+Thread.currentThread().getName()+" is acquired");
	   methodOne(this);
	   System.out.println("Method 2:"+Thread.currentThread().getName()+" is released");
	   
   }


}
public class DeadlockDemo1 {

	public static void main(String[] args) {


		SResource r1= new SResource();
		SResource r2= new SResource();
		
		new Thread()
		{
			public void run()
			{
				r1.methodOne(r2);
			}
			
		}.start();
		
		new Thread()
		{
			public void run()
			{
				r2.methodTwo(r1);
			}
			
		}.start();
	}

}
