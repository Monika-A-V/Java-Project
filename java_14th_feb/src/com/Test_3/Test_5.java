package com.Test_3;

//What is a constructor? What are the rules for constructor? Show a java code example of constructor overloading

class Car
{
	  String make;
	  String model;
	  int year;

	  
	  public Car() 
	  {
	    make = "Unknown";
	    model = "Unknown";
	    year = 0;
	  }

	 public Car(String make, String model) 
	 {
	    this.make = make;
	    this.model = model;
	    year = 0;
	  }

	  public Car(String make, String model, int year)
	  {
	    this.make = make;
	    this.model = model;
	    this.year = year;
	  }
}

public class Test_5
{

	public static void main(String[] args) 
	{
	
		Car c=new Car();
		System.out.println("car make : "+c.make+" car model : " +c.model+" car year : " +c.year);
		
		Car c1=new Car("Toyata","Camry");
		System.out.println("car make : " +c1.make+" car model : " +c1.model );
		
		Car c2=new Car("Honda","Accord",2020);
		System.out.println("car make : " +c2.make+" car model : " +c2.model+" car"+ " year : " +c2.year);

	}

}
