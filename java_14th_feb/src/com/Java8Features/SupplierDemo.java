package com.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		// anonymous inner way
		
				Supplier<String> s1= new Supplier<String>() {

					@Override
					public String get() {
						return "Shuruti";
					}
					
					
				};
				
				System.out.println(s1.get());
				
				// lambda
				
				Supplier<String> s2=()-> "PanNo-785544FG";
				System.out.println(s2.get());
				
				
				Supplier<List<Student>> sList=()->{
					
					ArrayList<Student> sal= new ArrayList<>();
					sal.add(new Student(101,"Shuruti",78.5f));
					sal.add(new Student(102,"Priyanka",88.5f));
					sal.add(new Student(103,"Pankaj",79.5f));
					sal.add(new Student(104,"Monika",89.5f));
					sal.add(new Student(105,"Anuja",80.5f));
					
					return sal;
					
				};
				
				System.out.println(sList.get());
			
	}

}
