package com.ArrayDemo;
import java.util.Arrays;
//count occurance of numbers in array and min repeated number also
public class minimumRepeatedChar {
	
	/*public static char findMinimumRepeatedChar(char[] a) {
	    int[] frequency = new int[256]; 
	    
	    for (int i = 0; i < a.length; i++) {
	        frequency[a[i]]++; 
	    }
	    
	    char minimumChar = a[0];
	    int minimumFrequency = frequency[a[0]];
	    
	    for (int i = 1; i < a.length; i++) {
	        if (frequency[a[i]] < minimumFrequency) { 
	            minimumChar = a[i];
	            minimumFrequency = frequency[a[i]];
	        }
	    }
	    
	    return minimumChar;
	}

	public static void main(String[] args)
	{
		char[] a = {'a', 'b', 'c', 'a', 'b', 'c', 'c', 'c', 'b', 'c', 'b'};
		char minimumChar = findMinimumRepeatedChar(a);
		System.out.println("Minimum repeated character: " + minimumChar);
	}}*/

public static void main(String[] args) {
	

int[] arr = {1, 2, 9, 4, 5, 2, 3, 4, 6};
	    	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	int count=1;
		    boolean isVisited=false;
        for(int k=i-1;k>=0;k--)
        {
        	if(arr[i]==arr[k])
        	{
        		isVisited=true;
        		break;
        	}
        }
        if(isVisited==false)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			count++;
        		}
        		
        	}
        	if(count>=1)
        	{
        	System.out.println(arr[i]+" "+count);
        }
	    }
	    
	    }}}