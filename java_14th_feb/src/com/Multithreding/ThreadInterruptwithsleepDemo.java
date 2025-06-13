package com.Multithreding;

public class ThreadInterruptwithsleepDemo extends Thread
{
	public ThreadInterruptwithsleepDemo()
	{
		super();
	}
	public ThreadInterruptwithsleepDemo(String name)
	{
		super(name);
	}

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
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
		ThreadInterruptwithsleepDemo t=new ThreadInterruptwithsleepDemo("my thread");
		
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
