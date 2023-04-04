package com.Assignment_5;

/*Create a class named 'Rectangle' with two data members 'length' and 
'breadth' and two methods to print the area and perimeter of the rectangle 
respectively. Its constructor having parameters for length and breadth is 
used to initialize length and breadth of the rectangle. Let class 'Square' 
inherit the 'Rectangle' class with its constructor having a parameter for its 
side (suppose s) calling the constructor of its parent class as 'super(s,s)'. 
Print the area and perimeter of a rectangle and a square*/

class Rectangle1 {
    private double length;
    private double breadth;
    
    public Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getArea() {
        return length * breadth;
    }
    
    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle1 {
    public Square(double side) {
        super(side, side);
    }
}
public class Q6 {

	public static void main(String[] args) {

		Rectangle1 rect = new Rectangle1(5, 10);
        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Rectangle perimeter: " + rect.getPerimeter());
        
        Square sq = new Square(7);
        System.out.println("Square area: " + sq.getArea());
        System.out.println("Square perimeter: " + sq.getPerimeter());
    }
	}


