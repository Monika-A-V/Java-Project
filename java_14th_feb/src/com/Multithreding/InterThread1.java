package com.Multithreding;


class SharedR
{
	
	public synchronized void methodOne() throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" has locked method one");
		
		System.out.println(Thread.currentThread().getName()+" has released method One");
		
		wait();
		
				
		System.out.println(Thread.currentThread().getName()+" has got back the lock on method one");
	}
	
	public synchronized void methodTwo() throws InterruptedException
	{
       Thread.sleep(500);
       
       notify();
       
       System.out.println("Thread is notified by :"+Thread.currentThread().getName());

		
	}
	
		
}
public class InterThread1 {

	public static void main(String[] args) {

		
	SharedR r= new SharedR();
	
	new Thread()
	{
		public void run()
		{
			try {
				r.methodOne();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}.start();
	
	new Thread()
	{
		public void run()
		{
			try {
				r.methodTwo();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}.start();
	
}

}