package com.Multithreding;

public class ThreadJoinDemo2 extends Thread
{

	public void run() 
	{

		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" -->"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadJoinDemo2 t1=new ThreadJoinDemo2();
		ThreadJoinDemo2 t2=new ThreadJoinDemo2();
		ThreadJoinDemo2 t3=new ThreadJoinDemo2();
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		}

}
