package com.ClassAndObject;

public class ThisKeyword 
{
	int rollno;  
	String name;  
	float fee; 
	
	public ThisKeyword()
	{
		this(2,"s",30);
		System.out.println("hello ");
	}
	
	public ThisKeyword(int rollno,String name,float fee)
	{  
		//this();
	    this.rollno=rollno;  
	    this.name=name;  
	    this.fee=fee;
	
	}  
	
	public void display()
	{
		this.Show();
		System.out.println(rollno+" "+name+" "+fee);
	}  
	public void Show()
	{
		System.out.println(name+" ");
	}
	

	public static void main(String[] args) 
	{
	ThisKeyword t=new ThisKeyword(3,"m",20);
	t.display();
	t.Show();
	
	
		

	}

}
