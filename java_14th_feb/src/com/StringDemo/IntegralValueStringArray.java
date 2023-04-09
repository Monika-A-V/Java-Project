package com.StringDemo;

import java.util.Arrays;
import java.util.Scanner;
public class IntegralValueStringArray
{

	public static void main(String[] args)
	{
	
		String[] s = {"A+2", "D+3", "B+7", "E+1"};

		for (int i=0; i<s.length; i++) 
		{
		    char c = s[i].charAt(0);
		    int integralValue = s[i].charAt(2) - '0';
		    System.out.println("Value with " + c + " is " + integralValue);
		}

		    }
}
               /*( Scanner sc = new Scanner(System.in);
		        String[] s = {"A+2", "D+3", "B+7", "E+1"};

		        System.out.println("Enter a character:");
		        char c1 = sc.next().charAt(0);

		        for (String str : s) {
		            char[] chars = str.toCharArray();
		            for (int i = 0; i < chars.length; i++) {
		                if (chars[i] == c1) {
		                    int integralValue = Character.getNumericValue(chars[i+1]);
		                    System.out.println("integral value of char " + chars[i] + " is = " + integralValue);
		                    break;
		                }
		            }
		        }
		    */

		/*Scanner sc = new Scanner(System.in);
		String s[] = {"A+2","D+3","B+7","E+1"};
		char[] result = new char[s.length * 3];

		System.out.println("Enter a character:");
		char c1 = sc.next().charAt(0);
		int index = 0;

		for (int i = 0; i < s.length; i++)
		{
		    char[] c = s[i].toCharArray();
		    for (int j = 0; j < c.length; j++)
		    {
		        result[index] = c[j];
		        index++;

		        if (c[j] == c1)
		        {
		            int i1 = (int) c[j];
		            System.out.println("integral value of char " +c[j]+" is = " +i1);
		        }
		    }
		}*/

		/*Scanner sc=new Scanner(System.in);
		String s[] = {"A+2","D+3","B+7","E+1"};
		char[] result = new char[s.length * 3]; 

		System.out.println("enter char");
		char c1=sc.next().charAt(0);
		int index = 0;
		for (String str : s) 
		{
		    char[] chars = str.toCharArray();
		    for (char c : chars) 
		    {
		        result[index++] = c;
		        if(c==c1)
		        {
		        	int i1 = (int)c;
                    System.out.println(i1); 
	}
		    }}*/
		



