package com.Multithreding;

public class ThreadSleepDemo1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}

		}
	}

	public static void main(String[] args)
	{
		ThreadSleepDemo1 t1=new ThreadSleepDemo1();
		t1.start();
		
		ThreadSleepDemo1 t2=new ThreadSleepDemo1();
		t2.start();

	}

}
