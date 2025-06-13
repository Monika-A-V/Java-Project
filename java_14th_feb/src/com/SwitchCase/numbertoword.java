package com.SwitchCase;

import java.util.*;

public class numbertoword {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int word=sc.nextInt();
		switch (word) {
        case 1:
        	System.out.println("One");
            break;
        case 2:
        	System.out.println("two");
        	break;
        case 3:
        	System.out.println("three");
            break;
        case 4:
        	System.out.println("four");
            break;
        case 5:
        	System.out.println("five");
            break;
        default:
            System.out.println("Number out of range");
            break;
    }

    System.out.println(word);
}

}
