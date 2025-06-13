package com.Test_3;
import java.util.*;

//National game of India is Hockey, China is Table Tennis, Bangladesh is Kabaddi, Italy is Football,
//United States is baseball. Write a Java program to read country name as user-input and to print the
//country’s national game. Use switch 

public class Test_14 
{
	 public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a country name: ");
	        String country = sc.nextLine();

	        switch (country.toLowerCase())
	        {
	            case "india":
	                System.out.println("The national game of India is Hockey.");
	                break;
	            case "china":
	                System.out.println("The national game of China is Table Tennis.");
	                break;
	            case "bangladesh":
	                System.out.println("The national game of Bangladesh is Kabaddi.");
	                break;
	            case "italy":
	                System.out.println("The national game of Italy is Football.");
	                break;
	            case "united states":
	                System.out.println("The national game of United States is Baseball.");
	                break;
	            default:
	                System.out.println("Sorry, we don't have information about the national game of " + country + ".");
	        }
	    }
	}



