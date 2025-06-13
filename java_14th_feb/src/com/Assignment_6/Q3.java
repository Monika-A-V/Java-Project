package com.Assignment_6;

/*. What is abstraction show the code of real time example?*/

interface Calculator {
    public int add(int a, int b);
    public int subtract(int a, int b);
    public int multiply(int a, int b);
    public double divide(double a, double b);
}
class SimpleCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }
}

public class Q3 {

	public static void main(String[] args) {

		SimpleCalculator calculator = new SimpleCalculator();

        int sum = calculator.add(5, 7);
        int difference = calculator.subtract(10, 3);
        int product = calculator.multiply(4, 6);
        double quotient = calculator.divide(15.0, 3.0);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
