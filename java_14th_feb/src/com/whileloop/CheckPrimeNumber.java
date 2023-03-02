package com.whileloop;
import java.util.*;

public class CheckPrimeNumber
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int i=2;
        boolean isPrime=true;
        
        while(i<number)
        {
        	if(number%i==0)
        	{
        		isPrime=false;
        		break;
        	}
        	i++;
        }
        if(isPrime==true)
        {
        	System.out.println("prime number");
        	
        }
        else
        {
        	System.out.println("not prime");
        	
        }

	}

}
