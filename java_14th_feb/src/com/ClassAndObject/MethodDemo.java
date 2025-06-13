package com.ClassAndObject;

public class MethodDemo
{
		//1.no return type no parameter
		
		public void show()
		{
			System.out.println("show method");
		}
		
		//2.no return type with parameter
		public void addition(int x,int y)
		{
			int z=x+y;
			System.out.println(z);
		}
		
		//3.method with return type no parameter
		
		public String getCity()
		{
			String city="pune";
			return city;
		}
		
		//4.method with return type and parameter
		
		public double areaOfCircle(int r,double PI) 
		{
		double area=PI*r*r;
		return area;
		}
		
		public static void main(String[] args)
		{

			MethodDemo m=new MethodDemo();
			m.show();
			
			m.addition(2, 2);
			
			String mycity=m.getCity();
			
			double result=m.areaOfCircle(4,4.2);
			System.out.println(result);
			
		    System.out.println("area = "+m.areaOfCircle(9,2.2));
	}

}
