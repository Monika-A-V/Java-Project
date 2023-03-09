package com.ClassAndObject;

class Base
{
String name;
Base()
{
this("");
System.out.println("No-argument constructor of" +" base class");
}
Base(String name)
{
this.name = name;
System.out.println("Calling parameterized constructor"+ " of base");
}
}
class Derived extends Base
{
Derived()
{
System.out.println("No-argument constructor " +"of derived");
}
Derived(String name)
{
super(name);
System.out.println("Calling parameterized " +"constructor of derived");
}
}
public class SuperKeywordConstructor 
{

	public static void main(String[] args)
	{
		

		Derived d=new Derived("test");
		
	}

}

