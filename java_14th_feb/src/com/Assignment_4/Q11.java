package com.Assignment_4;

/*Create a class to print the area of a square and a rectangle. The class has 
two methods with the same name but different number of parameters. The 
method for printing area of rectangle has two parameters which are length 
and breadth respectively while the other method for printing area of 
square has one parameter which is side of square.*/

class PrintArea {

	void area(int a)
	{
		System.out.println("Area of Sqaure =" +(a*a));
	}
	void area(double l,double b)
	{
		System.out.println("Area of Rectangle =" +(l*b));
	}
}
public class Q11 {

	public static void main(String[] args) {

		PrintArea a = new PrintArea();
		a.area(5);
		a.area(5.0, 2.0);
	}

}
