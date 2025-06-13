package com.Test_3;

//WAP to show Parameterized constructor


class MyClass
{
    String name;
    int age;

    
    public MyClass(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public void printDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Test_4
{
   public static void main(String[] args) 
   {
	   MyClass o = new MyClass("John", 25);
	   o.printDetails();
	   

	}

}
