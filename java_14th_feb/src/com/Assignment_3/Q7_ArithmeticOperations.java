package com.Assignment_3;

//Write java Program for arithmetic operation for each operation write 
//separate Method using parameter passing and return type.

public class Q7_ArithmeticOperations {
	
	 public static int add(int num1, int num2) {
	        return num1 + num2;
	    }
	    
	    public static int subtract(int num1, int num2) {
	        return num1 - num2;
	    }
	    
	    public static int multiply(int num1, int num2) {
	        return num1 * num2;
	    }
	    
	    public static double divide(int num1, int num2) {
	        return (double)num1 / num2;
	    }

public static void main(String[] args) {
    int num1 = 10;
    int num2 = 5;
    
    int sumResult = add(num1, num2);
    int diffResult = subtract(num1, num2);
    int prodResult = multiply(num1, num2);
    double divResult = divide(num1, num2);
    
    System.out.println("Sum of " + num1 + " and " + num2 + " is " + sumResult);
    System.out.println("Difference of " + num1 + " and " + num2 + " is " + diffResult);
    System.out.println("Product of " + num1 + " and " + num2 + " is " + prodResult);
    System.out.println("Division of " + num1 + " and " + num2 + " is " + divResult);
}

}
