
package com.Test_7;

//Write a java method called checkReverseSum which returns true if the sum of first
/*three numbers is equal to sum of last three numbers. Input is a string parameter to
the method, output is a boolean.
Input value  “678597”  returns true(6+7+8 and 5+9+7)
Input value “32105”  returns true(3+2+1 and 5+0+1)
Input value “123”  returns true(1+2+3 and 3+2+1)
Input value “8” returns false*/


public class Q5
{
	public static boolean checkReverseSum(String s)
	{
	    boolean result = false;
	    if (s.length() >= 6) 
	    {
	        int sumFirstThree = 0;
	        int sumLastThree = 0;
	        for (int i = 0; i < 3; i++) {
	            sumFirstThree += Character.getNumericValue(s.charAt(i));
	            sumLastThree += Character.getNumericValue(s.charAt(s.length() - 1 - i));
	        }
	        result = sumFirstThree == sumLastThree;
	    }
	    return result;
	}

	public static void main(String[] args) 
	{
		String s = "678597";
        boolean result = checkReverseSum(s);
        System.out.println(result);
    }

	}
            