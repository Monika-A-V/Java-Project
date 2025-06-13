package com.Test_3;

// Define Inheritance.WAP to give example of multilevel inheritance (real life example)

class Animal 
{
    String name;
    int age;
    
    void eat() 
    {
        System.out.println(name + " is eating.");
    }
    
    void sleep() 
    {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal 
{
    void bark()
    {
        System.out.println(name + " is barking.");
    }
}

class LabradorRetriever extends Dog 
{
    void retrieve() 
    {
        System.out.println(name + " is retrieving.");
    }
}

public class Test_3 
{

	public static void main(String[] args) 
	{
	
		LabradorRetriever l = new LabradorRetriever();
        l.name = "Scooby";
        l.age = 3;
        l.eat();
        l.sleep();
        l.bark();
        l.retrieve();

	}

}
