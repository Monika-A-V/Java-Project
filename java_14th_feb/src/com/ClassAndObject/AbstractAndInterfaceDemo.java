package com.ClassAndObject;

abstract class AbstractClass 
{
 int num1;
 public abstract void setNum(int num1);
}

interface MyInterface
{
 int num = 5;
}

class ChildClass extends AbstractClass implements MyInterface 
{
 public void setNum(int num1) 
 {
     this.num1 = num1;
 }

 public void performAddition() 
 {
     int sum = this.num1 + MyInterface.num;
     System.out.println("Sum of num and MyInterface.num = " + sum);
 }
}
public class AbstractAndInterfaceDemo 
{

	public static void main(String[] args)
	{
		
        ChildClass child = new ChildClass();
		child.setNum(10);
		child.performAddition(); // Output: Sum of num and MyInterface.num = 15

	}

}
