package com.Assignment_6;

//what is the output of following code
class Base {
	 final void show() {
	 System.out.println("Base::show() called");
	 }
	}
	class Derived extends Base {
	 /*void show() {*/
	 //System.out.println("Derived::show() called");
	 }
	
class Q1 
{

	public static void main(String[] args) {

		Base b = new Derived();;
		 b.show();
	}

}
