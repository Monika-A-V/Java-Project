package com.JavaDemo;

class NumberD
{
	public Object create()
	{
		return this;
	}
}
class CharD extends NumberD
{
	public Character create1()
	{
		return 'a';
	}
}


public class Demo3 
{

	public static void main(String[] args) 
	{
       CharD c=new CharD();
       c.create1();
     
      
		
	}

}
