package com.FileHandling.LamdaExpression;

public class ThreadLambda {

	public static void main(String[] args) {

		// without Lambda
		
				Runnable r1= new Runnable()
						{
					
					    public void run()
					    {
					    	System.out.println("Thread is running");
					    }
					
						};
						
				Thread t1= new Thread(r1);
				t1.start();
				
				// with lambda
				
				Runnable r2=()->{
					System.out.println(Thread.currentThread().getName()+" is running");
				};
				
				Thread t2= new Thread(r2);
				t2.start();
				
	}

}
