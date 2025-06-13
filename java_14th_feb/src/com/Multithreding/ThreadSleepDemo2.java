package com.Multithreding;

public class ThreadSleepDemo2 extends Thread
{

	public static void main(String[] args)
	{
		Thread t=new Thread() {
			
			public void run()
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println(i);
					try
					{
						Thread.sleep(500);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}

				}

		}
			};t.start();
			
			Thread t1=new Thread() {
				
				public void run()
				{
					for(int i=11;i<=15;i++)
					{
						System.out.println(i);
						try
						{
							Thread.sleep(500);
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}

					}

			}
				};t1.start();
				
				Thread t2=new Thread() {
					
					public void run()
					{
						for(int i=21;i<=25;i++)
						{
							System.out.println(i);
							try
							{
								Thread.sleep(500);
							}
							catch(InterruptedException e)
							{
								e.printStackTrace();
							}

						}

				}
					};t2.start();

		
	}

}
