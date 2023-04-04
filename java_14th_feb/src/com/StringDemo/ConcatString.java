
package com.StringDemo;

import java.util.Arrays;

public class ConcatString 
{
	void con(String s1)
	{
		        String s2=" language";
		        int a1 = s1.length();
		        int a2 = s2.length();
		        char arr3[] = new char[a1 + a2];

		        char arr1[] = s1.toCharArray();
		        char arr2[] = s2.toCharArray();

		        for (int i = 0; i < a1; i++) 
		        {
		            arr3[i] = arr1[i];
		        }

		        for (int i = 0; i < a2; i++) 
		        {
		            arr3[a1 + i] = arr2[i];
		        }
		        for(int i=0;i<arr3.length;i++)
		        {
		        	
		        }
		        System.out.println(arr3);
		    }

		    public static void main(String[] args)
		    {
		        String s1 = "hello java";
		        ConcatString c = new ConcatString();
		        c.con(s1);
		    }
		}