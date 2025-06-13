package com.Logical_Programs;

public class IncrementDecrementOperators
{

	public static void main(String[] args) 
	{
		int a = 5;
		int b = a++; // b is assigned the value of a (5) and then a is incremented to 6
		System.out.println("a = "+a); // Output: 6
		System.out.println("b = "+b); // Output: 5
		
		int c = 5;
		int d = ++c; // a is incremented to 6 and then b is assigned the value of a (6)
		System.out.println("c = "+c); // Output: 6
		System.out.println("d = "+d); // Output: 6
		
		int a1 = 5;
		int b1 = a1--; // b is assigned the value of a (5) and then a is decremented to 4
		System.out.println("a1 = "+a1); // Output: 4
		System.out.println("b1 = "+b1); // Output: 5
		
		int c1 = 5;
		int d1 = --c1; // a is decremented to 4 and then b is assigned the value of a (4)
		System.out.println("c1 = "+c1); // Output: 4
		System.out.println("d1 = "+d1); // Output: 4




	}

}
