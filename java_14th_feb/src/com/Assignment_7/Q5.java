package com.Assignment_7;
import java .util.*;

//Take 10 integer inputs from user and store them in an array. Now, copy all 
//the elements in another array but in reverse order

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a=new int[10];
		int rev[]=new int[10];
		
		System.out.print("enter elements of array");
		for(int i=0;i<a.length;i++)
	   {
		   a[i]=sc.nextInt();
		   
	   }
		System.out.println("reverse array elements are");
		for(int i=a.length-1;i>=0;i--)
		{
			rev[i]=a[i];
		
		System.out.println(rev[i]);
		
		}
	}

}
