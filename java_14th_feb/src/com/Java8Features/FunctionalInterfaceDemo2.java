package com.Java8Features;


@FunctionalInterface
interface Functionable
{
	void func(int num);

}

@FunctionalInterface
interface Functions
{
	int func(int num);

}
public class FunctionalInterfaceDemo2 {

	public static void main(String[] args)
	{
		Functionable f1= (int num)->{
            System.out.println("number:"+num);
            System.out.println(num*num);
             };
f1.func(7);

Functionable f2= num->System.out.println(num*num*num);
f2.func(10);

Functions f3=num->{return (2*num);};
System.out.println(f3.func(8));

Functions f4=num->(4*num);

System.out.println(f4.func(6));

	}

}
