package com.ClassAndObject;

public class MethodOverLoad
{
	int L;
	int W;
	
	public MethodOverLoad(int l,int w)
	{
		this.L=l;
		this.W=w;
	}
	
	public void calculate()
	{
		//int L=2;
		//int W=3;
		System.out.println("Are of rectangle = "+(L*W));
	}
	public void calculate(int r)
	{
		
		double a,pi=3.14;
		a =pi*r*r;
		System.out.println("area of circle is = "+a);
	}
	public void calculate(float s)
	{
		double a=s*s;
		System.out.println("area of square = "+a);
	}
	public void calculate(int b,float h)
	{
		
		double a=(b/h)/2;
		System.out.println("area of triangle = "+a);
	}

	public static void main(String[] args) 
	{
		MethodOverLoad m=new MethodOverLoad(12,12);
		m.calculate();
		m.calculate(2);
		m.calculate(12.2f);
		m.calculate(2,12.0f);
		

	}

}
