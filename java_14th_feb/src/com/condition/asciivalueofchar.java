package com.condition;
import java.util.*;

public class asciivalueofchar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char");
		char ch=sc.next().charAt(0);
		
		int asci=(int)ch;
		System.out.println(asci);

	}

}
