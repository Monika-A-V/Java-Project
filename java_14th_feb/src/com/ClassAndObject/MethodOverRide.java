package com.ClassAndObject;

class Animal 
{
    public void makeSound()
    {
        System.out.println("Animal is making a sound");
    }
}
class Cat extends Animal 
{
    @Override
    public void makeSound()
    {
        System.out.println("Meow!");
    }
}
class dog extends Animal
{
	@Override
	public void makeSound()
	{
		System.out.println("Bhow!");
	}
}
public class MethodOverRide 
{

	public static void main(String[] args)
	{
		Animal a=new Cat();
		a.makeSound();
		
		Animal a1=new dog();
		a1.makeSound();
		
    }
}
