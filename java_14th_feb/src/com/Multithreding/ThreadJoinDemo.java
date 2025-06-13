package com.Multithreding;

public class ThreadJoinDemo extends Thread
{

	public static void main(String[] args) {

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
				System.out.println("1 to 5 printed");

		}
			};t.start();
			
			Thread t1=new Thread() {
				
				public void run()
				{
					try 
					{
						t.join();
					} 
					catch (InterruptedException e1) 
					{
						e1.printStackTrace();
					}
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
					System.out.println("11 to 15 printed");

			}
				};t1.start();
				
				Thread t2=new Thread() {
					
					public void run()
					{
						try {
							t1.join();
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
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
						System.out.println("21 to 25 printed");

				}
					};t2.start();

	}

}
