package com.Test_3;

//	what will be the output of program?

public class Test_6 
{
	
	            int x = 10;

				public void assign(int x) 
				{
					x = x;
					System.out.println(this.x);
				}

				public static void main(String[] args)
				{

					
					new Test_6().assign(100);

				}

			}


