package com.Multithreding;

public class RunnableSleepDemo1 implements Runnable
{

	@Override
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
		RunnableSleepDemo1 r1=new RunnableSleepDemo1();
		Thread t1=new Thread(r1);
		t1.start();
		
		RunnableSleepDemo1 r2=new RunnableSleepDemo1();
		Thread t2=new Thread(r2);
		t2.start();
		
	}


}
