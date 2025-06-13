package com.Test_10;
//WHAT IS OUTPUT OF THIS CODE

class A
{
static int num = 10;
public void showNum() 
{
	System.out.println(num);
}
}
class B extends A
{
int i;
}

public class Q1 {

	public static void main(String[] args)
	{
		 B b1 = new B();
	     B b2 = new B();
	     b2.showNum(); 
	     b2.num = 25;
	     b1.showNum(); 
	     A.num = 50; 
	     b1.showNum(); 
	     b1.num = 20;
				}
				}