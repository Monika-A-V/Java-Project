package com.Assignment_5;

//predict the output
class A
{
 String s = "Class A";
}
class B extends A
{
 String s = "Class B";
 B()
 {
 System.out.println(super.s);
 }
}
class C extends B
{
 String s = "Class C";
 C()
 {
 System.out.println(super.s);
 }
}
 
public class Q11 {

	public static void main(String[] args)
	 {
	 C c = new C();
	 System.out.println(c.s);
	 } 
}
