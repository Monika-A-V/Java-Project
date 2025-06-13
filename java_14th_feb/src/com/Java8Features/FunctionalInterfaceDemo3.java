package com.Java8Features;


@FunctionalInterface
interface MathFunctions
{
	void funct(int num1,int num2);

}

interface MathFunc
{
	float func(int num1,int num2);

}
public class FunctionalInterfaceDemo3
{

	public static void main(String[] args) 
	{
		MathFunctions m1= (num1,num2)->System.out.println((num1+num2));
		m1.funct(34, 56);
		
		MathFunc m2=(num1,num2)-> (num1*num2);
		System.out.println(m2.func(4, 5));

}}