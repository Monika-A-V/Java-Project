package com.Test_4;

/*) Write a  program that prints the numbers
from 1 to 50. But for multiples of three print “buzz” instead of the
number and for the multiples of five print “fizz”. For numbers which
are multiples of both three and five print “ buzzfizz “. After program
looping is completed print how many times buzz was printed, fizz
was printed and buzzfizz was printed.*/

public class Test_13 {
	
	    public static void main(String[] args) {
	        int buzzCount = 0;
	        int fizzCount = 0;
	        int buzzfizzCount = 0;
	        
	        for (int i = 1; i <= 50; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println("buzzfizz");
	                buzzfizzCount++;
	            } else if (i % 3 == 0) {
	                System.out.println("buzz");
	                buzzCount++;
	            } else if (i % 5 == 0) {
	                System.out.println("fizz");
	                fizzCount++;
	            } else {
	                System.out.println(i);
	            }
	        
	        }
	        
	        System.out.println("buzz was printed " + buzzCount + " times");
	        System.out.println("fizz was printed " + fizzCount + " times");
	        System.out.println("buzzfizz was printed " + buzzfizzCount + " times");
	    }
	}

