package com.Multithreding;

public class RunnableSleep implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" -->"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		RunnableSleep r1=new RunnableSleep();
		RunnableSleep r2=new RunnableSleep();
		RunnableSleep r3=new RunnableSleep();
		
		Thread t1;
		t1=new Thread(r1);
		t1.start();
		
		t1=new Thread(r2);
		t1.start();
		
		t1=new Thread(r3);
		t1.start();
		}

}
