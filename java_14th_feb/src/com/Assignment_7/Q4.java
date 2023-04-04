package com.Assignment_7;
import java.util.*;

//Take 20 integer inputs from user and print the following: 
//number of positive numbers
//number of negative numbers
//number of odd numbers
//number of even numbers
//number of 0s.

public class Q4 {

	public static void main(String[] args) 
	{

                Scanner sc= new Scanner(System.in);
		        int[] n = new int[20];
		        int positiveCount = 0;
		        int negativeCount = 0;
		        int oddCount = 0;
		        int evenCount = 0;
		        int zeroCount = 0;

		        for (int i = 0; i < 20; i++) {
		            System.out.print("Enter number " + (i+1) + ": ");
		            n[i] = sc.nextInt();
		        }

		        for (int i = 0; i < 20; i++) {
		            if (n[i] > 0) {
		                positiveCount++;
		                if (n[i] % 2 == 0) {
		                    evenCount++;
		                } else {
		                    oddCount++;
		                }
		            } else if (n[i] < 0) {
		                negativeCount++;
		                if (n[i] % 2 == 0) {
		                    evenCount++;
		                } else {
		                    oddCount++;
		                }
		            } else {
		                zeroCount++;
		            }
		        }

		        System.out.println("Number of positive numbers: " + positiveCount);
		        System.out.println("Number of negative numbers: " + negativeCount);
		        System.out.println("Number of odd numbers: " + oddCount);
		        System.out.println("Number of add numbers: " + evenCount);
	}}
