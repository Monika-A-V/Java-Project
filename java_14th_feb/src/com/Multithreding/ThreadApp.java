package com.Multithreding;

public class ThreadApp extends Thread
{
	public void run()
	{
		System.out.println("name :"+Thread.currentThread().getName());
		System.out.println("priority :"+Thread.currentThread().getPriority());

	}

	public static void main(String[] args) 
	{
		ThreadApp t1=new ThreadApp();
		t1.setName("my thread");
		t1.setPriority(MAX_PRIORITY);
		//t1.setPriority(MIN_PRIORITY);
		//t1.setPriority(NORM_PRIORITY);
		
		t1.start();

	}

}
