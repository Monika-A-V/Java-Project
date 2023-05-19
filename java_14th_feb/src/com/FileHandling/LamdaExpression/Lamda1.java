package com.FileHandling.LamdaExpression;

@FunctionalInterface
interface Movable
{
	abstract void move();
	default void changeSpeed()
	{
		System.out.println("Speed increased.....");
	}
  
	
}
public class Lamda1  //implements Movable 
{
	/*
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}*/

	public static void main(String[] args)
	{
		// without lambda
		
				Movable car = new Movable(){
					
					public void move()
					{
						System.out.println("Car is moving");
					}
				};
				
				car.move();
				car.changeSpeed();
				
				Movable ball = new Movable() {
					
					@Override
					public void move() {
						System.out.println("Ball is moving.......");
						
					}
				};

				ball.move();
				
				// with lambda
				
				Movable truck=()->{
					System.out.println("Truck is moving");
				};
				
				truck.move();
				
				
			}}