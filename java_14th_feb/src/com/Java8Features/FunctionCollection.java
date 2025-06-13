package com.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionCollection {

	public static void main(String[] args) {

        List<Integer> a1= Arrays.asList(4,5,6,7,8,9);
		
		Function<Integer, String> f1= num-> (num%2==0)?"Even":"Odd";
		
		for(Integer n: a1)
		{
			System.out.println(n+" :"+f1.apply(n));
		}
		
		// add 2 to each number and then find even or odd
	}

}
