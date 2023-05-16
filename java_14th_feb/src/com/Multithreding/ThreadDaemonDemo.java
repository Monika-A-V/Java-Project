package com.Multithreding;

public class ThreadDaemonDemo implements Runnable
{
	@Override
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemon thread : "+Thread.currentThread().getName());
			System.out.println("daemon thread priority : "+Thread.currentThread().getPriority());
			System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");

		}
		else
		{
			System.out.println("user thread : "+Thread.currentThread().getName());
			System.out.println("user thread priority : "+Thread.currentThread().getPriority());
			System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");

		}
		
	}

	public static void main(String[] args)
	{
		ThreadDaemonDemo d1=new ThreadDaemonDemo();
		Thread t1=new Thread(d1,"thread1");
		
		ThreadDaemonDemo d2=new ThreadDaemonDemo();
		Thread t2=new Thread(d2,"thread2");
		
		//t1.start();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		}
	}


