package com.Java8Features;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<String> 
{

	@Override
	public void accept(String t) {
	
		System.out.println(t.toUpperCase());
	}

	public static void main(String[] args) {
		
		Consumer<String> c1= new ConsumerDemo();
		c1.accept("Java");
		
		// using anonymous way
		
		Consumer<String> c2= new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t.length());
				
			}
			
			
		};
		
		c2.accept("Java");
		//////////////////////////////////////////
		
		// using Lambda
		
		Consumer<String>c3= t->System.out.println(t.toLowerCase());
		
		c3.accept("WELCOME");
		
		Consumer<Integer> c4= x->System.out.println(x*x);
		
		c4.accept(8);
		
		// andThen : function chaining: Chaining the consumers
		
		Consumer<String> s1= t-> System.out.println("Welcome "+t);;
		Consumer<String> s2= t-> System.out.println("Length of:"+t+" "+t.length());
		
		s1.andThen(s2).accept("Shuruti");
		
	}

}
