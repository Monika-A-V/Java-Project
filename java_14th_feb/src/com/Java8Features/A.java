package com.Java8Features;

interface I1
{
	void doTask();
	default void doTask1()
	{
		System.out.println("default way");
	}
	static void doTask2()
	{
		System.out.println("static task");
	}
}
public class A implements I1
{
	public void doTask()
	{
		System.out.println("performing task");
}
	public void doTask1()
	{
		System.out.println("override default way");
	}

	public static void main(String[] args) 
	{
		I1 ref=new A();
		ref.doTask();
		ref.doTask1();
		I1.doTask2();
		}

}
