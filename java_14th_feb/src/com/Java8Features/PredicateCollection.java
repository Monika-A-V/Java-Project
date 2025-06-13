package com.Java8Features;

import java.util.ArrayList;
import java.util.function.Predicate;

class Person {
	String name;
	int age;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
public class PredicateCollection {

	public static void main(String[] args) 
	{
        Predicate<Integer> p2= t-> (t>18);
		
		ArrayList< Person> pal= new ArrayList<>();
		pal.add(new Person("Ashish", 23));
		pal.add(new Person("Akshat", 17));
		pal.add(new Person("Prihul", 28));
		pal.add(new Person("Ruhani", 18));
		pal.add(new Person("Hemraj", 20));
		
		for(Person obj:pal)
		{
			System.out.println(obj.getName()+ "  :"+(p2.test(obj.getAge())?"Vote":"TooYoung"));
		}
	}
}