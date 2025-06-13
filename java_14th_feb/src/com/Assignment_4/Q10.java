package com.Assignment_4;

/*Show the use of this keyword in Program –
a. with a field(Instance Variable)
b. with Constructor
c. with Method*/

class UseThisKeyword {
	int id;
	
	UseThisKeyword()
	{
		System.out.println("I am default constructor.....");
	}
	UseThisKeyword(int id)
	{
		this();
		System.out.println("I am Parameterized constructor....");
		
	}
	public void input(int id)
	{
		this.id=id;
	}
	public void display()
	{
		System.out.println(id);
	}
	
	public void m1()
	{
		System.out.println("Method m1");
	}
	public void m2()
	{
		System.out.println("Method m2");
		this.m1();
		System.out.println("Hello java....");
	}}
public class Q10 {

	public static void main(String[] args) {

		UseThisKeyword us=new UseThisKeyword();
		UseThisKeyword t=new UseThisKeyword(12);
		
		us.input(11);
		us.display();
		us.m2();
	}

}
	

