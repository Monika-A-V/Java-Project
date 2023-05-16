package com.Multithreding;

public class DeadlockDemo2 {

	public static void main(String[] args) {

		final String s1="Java";
		final String s2="Python";
		
		new Thread()
		{
			public void run()
			{
				synchronized (s1) {
					
					System.out.println(Thread.currentThread().getName()+"has locked "+s1);
					
					try {
						Thread.sleep(300);
					  } catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (s2) {
						
						System.out.println(Thread.currentThread().getName()+"has locked "+s2);
					}
					
				}
				
				System.out.println(Thread.currentThread().getName()+"has finished ");
			}
			
		}.start();
		
		new Thread()
		{
			public void run()
			{
                 synchronized (s2) {
					
					System.out.println(Thread.currentThread().getName()+"has locked "+s2);
					
					try {
						Thread.sleep(300);
					  } catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (s1) {
						
						System.out.println(Thread.currentThread().getName()+"has locked "+s1);
					}
					
				}
				
				System.out.println(Thread.currentThread().getName()+"has finished ");
			}
			
			
		}.start();
	}

}
