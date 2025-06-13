package com.FileHandling.LamdaExpression;


@FunctionalInterface
interface Speedable
{
	abstract void move(float speed);
	default void changeSpeed()
	{
		System.out.println("Speed increased.....");
	}
  
	
}
public class Lamda2 {

	public static void main(String[] args) {

		Speedable car=(speed)->{
			System.out.println("Car is moving with speed "+speed+"km/hr");
		};

		car.move(80);
		
		// with single argument bracket can be omitted
		
		Speedable ball= speed->{
			System.out.println("Ball is rolling with speed "+speed+"km/hr");
		};

		ball.move(20);
	}

}
