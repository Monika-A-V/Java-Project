
package com.Test_5;
import java.util.*;

//Write a Java program to find a missing number in an array. Means
//e.g. array has 1 to n element in sequence(n can be 50 or 100)
//arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5.

public class Test_1 
{
	
public static void main(String[] args)
	{
	int a[] = {1, 2, 3, 4, 6, 7};
	int a1=a.length;
    int n = 7;
    
    int totalSum = n * (n + 1) / 2;
    int actualSum = 0;
    
    for (int i = 0; i < a1; i++) 
    {
        actualSum = actualSum+a[i];
    }
    
    int missingNumber = totalSum - actualSum; 
    
    System.out.println("The missing number is " + missingNumber);
}
}