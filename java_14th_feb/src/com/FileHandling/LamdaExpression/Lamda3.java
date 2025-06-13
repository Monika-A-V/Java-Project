package com.FileHandling.LamdaExpression;


@FunctionalInterface
interface Speedable2
{
	abstract float move(float speed);
	 
	
}
public class Lamda3 {

	public static void main(String[] args) {

             Speedable2 car=(speed)->{
			
			//System.out.println("Original speed of car:"+speed);
			//speed+=50;
			//return speed;
			return (speed+50);
			
		};
		
		
		System.out.println("Car has increased speed to"+car.move(50)+" km/hr");
		
		// single return statement body can be omitted
		
		Speedable2 truck=(speed)->(speed+30);
		
		System.out.println("Truck has increased speed to"+truck.move(50)+" km/hr");
	}

}
