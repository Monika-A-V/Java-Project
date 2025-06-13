package com.Assignment_6;

/*WAP to check whether final method of parent can be inherited in Child 
class*/
class Parent {
	   public final void foo() {
	      System.out.println("Parent.foo()");
	   }
	}
class Child extends Parent {
	   // This will result in a compiler error since final methods cannot be overridden.
	   // public void foo() {
	   //    System.out.println("Child.foo()");
	   // }
	}
public class Q5 {

	public static void main(String[] args) {

		 Child child = new Child();
	      child.foo(); // This will call Parent.foo() since it cannot be overridden.
	   }
	}
