package com.SwitchCase;
import java.util.*;

public class areaofrectanglecircletrianglesquare 
{

	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter shape choice (rectangle, circle, triangle, square): ");
	    String choice = scanner.nextLine().toLowerCase();

	    
	    switch (choice) 
	    {
	      case "rectangle":
	        System.out.print("Enter width of rectangle: ");
	        double width = scanner.nextDouble();
	        System.out.print("Enter height of rectangle: ");
	        double height = scanner.nextDouble();
	        double rectangleArea = width * height;
	        System.out.println("Area of rectangle: " + rectangleArea);
	        break;

	      case "circle":
	        System.out.print("Enter radius of circle: ");
	        double radius = scanner.nextDouble();
	        double circleArea = 3.14 * radius * radius;
	        System.out.println("Area of circle: " + circleArea);
	        break;

	      case "triangle":
	        System.out.print("Enter base of triangle: ");
	        double base = scanner.nextDouble();
	        System.out.print("Enter height of triangle: ");
	        double triHeight = scanner.nextDouble();
	        double triangleArea = 0.5 * base * triHeight;
	        System.out.println("Area of triangle: " + triangleArea);
	        break;

	      case "square":
	        System.out.print("Enter side length of square: ");
	        double side = scanner.nextDouble();
	        double squareArea = side * side;
	        System.out.println("Area of square: " + squareArea);
	        break;

	      default:
	        System.out.println("Invalid shape choice.");
	    }
	  }
	

}
