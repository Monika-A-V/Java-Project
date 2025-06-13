package com.Test_10;

class C 
{
int id;
String name;

C(int id) 
{
this.id = id;
}
}

class D extends C 
{ 
	String color;
	String type;

    D() 
    {
    	super(1);
    	this.color = "Red";
    }

   D(String color)
 {
      this();
      this.color = color;
}
}


public class Q5 {

	public static void main(String[] args) {

		D d = new D("Blue"); 
		System.out.println(d.color);
	}
	}
