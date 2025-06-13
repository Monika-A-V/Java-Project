package com.Assignment_7;

//Write a program to check if elements of an array are same or not it read 
//from front or back. E.g.- {2,3,15,15,3,2}
public class Q7 {

	public static void main(String[] args) {
		
			    int[] arr = {2, 3, 15, 15, 3, 2};

			    boolean isSame = true;
			    for (int i = 0; i < arr.length / 2; i++) {
			      if (arr[i] != arr[arr.length - i - 1]) {
			        isSame = false;
			        break;
			      }
			    } if (isSame) {
			      System.out.println("The elements of the array are the same");
			    } else {
			      System.out.println("The elements of the array are not the same");
			    }
			  }
			}
	
