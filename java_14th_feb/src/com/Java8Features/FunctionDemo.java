package com.Java8Features;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, String> f1= new Function<String, String>() {

			@Override
			public String apply(String t) {
				
				return t.concat("@thinkq.com");
			}
		};
		
		System.out.println(f1.apply("Shuruti"));
		
		// using lambda
		
		Function<String, String> f2= t-> t.concat("@thinkq.com");
		System.out.println(f2.apply("Priya"));
		
		Function<Integer,String> f3= num-> (num%2==0)?"Even":"Odd";
		System.out.println(f3.apply(8));
		
		
		//and Then
		Function<String,Integer> f4= t->t.length();
		String s="Shuruti";
		System.out.println("Length of is:"+f2.andThen(f4).apply(s));
     
	}

}
