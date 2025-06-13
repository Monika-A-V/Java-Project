package com.Java8Features;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p1= new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if(t>18)
					return true;
				else
					return false;
			}
		};
		
		System.out.println(p1.test(24)?"You can vote":"You cannot vote");
		
		// using lambda
		
		Predicate<Integer> p2= t-> (t>18);
		
		System.out.println(p2.test(19));
		
	}

}
