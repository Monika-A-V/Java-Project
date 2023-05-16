package com.Multithreding;

public class ThreadInterruptwithoutsleepDemo extends Thread
{
	public ThreadInterruptwithoutsleepDemo()
	{
		super();
	}
	public ThreadInterruptwithoutsleepDemo(String name)
	{
		super(name);
	}

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			
			if(Thread.interrupted())
			{
				System.out.println(Thread.currentThread().getName()+" interrupt :" +i);
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" normal :" +i);

			}
		}
	}

	public static void main(String[] args) 
	{
      ThreadInterruptwithoutsleepDemo t=new ThreadInterruptwithoutsleepDemo("my thread");
		
		//main thread
		System.out.println(Thread.currentThread().getName());
	
	    try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       ///////////////////////////
	    t.start();
	    t.interrupt();
	}

}

