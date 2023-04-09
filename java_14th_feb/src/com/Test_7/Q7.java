package com.Test_7;

//How to remove Characters from the first String which are present in the second String.
/*e.g String1-india is great nation.
string2-in
output-da s great*/

public class Q7 {

	public static void main(String[] args)
	{
		    String str1 = "india is great nation";
		    String str2 = "in";
		    String result = "";
		    for (int i = 0; i < str1.length(); i++) 
		    {
		        char c = str1.charAt(i);
		        boolean found = false;
		        for (int j = 0; j < str2.length(); j++)
		        {
		            if (c == str2.charAt(j))
		            {
		                found = true;
		                break;
		            }
		        }
		        if (!found) 
		        {
		            result += c;
		        }
		    }
		    System.out.println(result);
		}

}
