package com.Multithreding;

public class ThreadClassDemo extends Thread
{

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());

		ThreadClassDemo t1=new ThreadClassDemo();
		t1.start();
		

		ThreadClassDemo t2=new ThreadClassDemo();
		t2.start();

	}

}
