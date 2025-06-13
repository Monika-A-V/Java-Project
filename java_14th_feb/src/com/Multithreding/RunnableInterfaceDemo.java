package com.Multithreding;

public class RunnableInterfaceDemo implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args)
	{
		RunnableInterfaceDemo r1=new RunnableInterfaceDemo();
		Thread t1=new Thread(r1);
		t1.start();

	}
}
