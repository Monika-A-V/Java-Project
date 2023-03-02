package com.ternery;
import java.util.*;

public class numbergreaterthan50lessthan100 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		String result=(n>50 && n<100)?"the num is greater than 50 and less than 100":"the num is not between 50 and 100";
		System.out.println(result);
		

	}

}
