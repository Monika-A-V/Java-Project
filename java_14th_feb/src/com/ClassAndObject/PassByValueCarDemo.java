package com.ClassAndObject;

public class PassByValueCarDemo
{
	String str;
	
	public void checkCar(PassByValueCarDemo  d)
	{
		System.out.println(d.str);
		d.str="black";
		
	}

	public static void main(String[] args)
	{
		PassByValueCarDemo p=new PassByValueCarDemo();
		
		p.str="red";
		
		p.checkCar(p);
		System.out.println(p.str);
		//System.out.println(p);
				
				
		

	}

}
