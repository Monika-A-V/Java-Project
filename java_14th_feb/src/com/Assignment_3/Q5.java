package com.Assignment_3;

//Write a program to copy values of one object into another by assigning the 
//values of one object into another.

class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Q5 {
	
	public static void main(String[] args) {
        
        Person person1 = new Person("John", 25);
        
        Person person2 = new Person("", 0);
        
        person2.name = person1.name;
        person2.age = person1.age;
        
        System.out.println("Person 2: name=" + person2.name + ", age=" + person2.age);
    }

}
