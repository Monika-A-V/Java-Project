package com.ClassAndObject;

class ThisKeywordConstructor 
{
    public String name;
    public int age;
    public double height;

    public ThisKeywordConstructor()
    {
        this("John Doe");
    }

    public ThisKeywordConstructor(String name)
    {
        this(name, 25); 
    }

    public ThisKeywordConstructor(String name, int age) 
    {
        this(name, age, 5.5); 
    }

    public ThisKeywordConstructor(String name, int age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    
    
    public static void main(String[] args) 
    {
        ThisKeywordConstructor obj1 = new ThisKeywordConstructor(); 
        ThisKeywordConstructor obj2 = new ThisKeywordConstructor("Alice"); 
        ThisKeywordConstructor obj3 = new ThisKeywordConstructor("Bob", 30); 
        ThisKeywordConstructor obj4 = new ThisKeywordConstructor("Charlie", 35, 6.0); 
        
       
        
        System.out.println("Object 1: name=" + obj1.name + ", age=" + obj1.age + ", height=" + obj1.height);
        System.out.println("Object 2: name=" + obj2.name + ", age=" + obj2.age + ", height=" + obj2.height);
        System.out.println("Object 3: name=" + obj3.name + ", age=" + obj3.age + ", height=" + obj3.height);
        System.out.println("Object 4: name=" + obj4.name + ", age=" + obj4.age + ", height=" + obj4.height);
    }
}

