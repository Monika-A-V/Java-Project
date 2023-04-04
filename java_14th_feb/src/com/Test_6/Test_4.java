package com.Test_6;
import java.util.Scanner;

/*write a program that takes a number as input from user. The key number 
is 4 and the user enters single digit numbers. Ask the user for a 
number till he gets the correct answer. Then display the number 
of tries it took to guess the correct number.*/

public class Test_4 {

	public static void main(String[] args) {


		        int keyNumber = 4;
		        int guess;
		        int numTries = 0;
		        Scanner scanner = new Scanner(System.in);
		        
		        do {
		            System.out.print("Enter a single digit number: ");
		            guess = scanner.nextInt();
		            numTries++;
		            
		            if (guess == keyNumber) {
		                System.out.println("Congratulations, you guessed the number in " + numTries + " tries!");
		            } else {
		                System.out.println("Sorry, that's not the correct number. Please try again.");
		            }
		        } while (guess != keyNumber);
		        
		    }
		}
