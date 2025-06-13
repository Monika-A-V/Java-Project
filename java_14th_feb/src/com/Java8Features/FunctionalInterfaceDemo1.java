package com.Java8Features;


@FunctionalInterface
interface Movable
{
   public void move();	
   default void changeSpeed()
   {
	   System.out.println("Speed increased....");
   }

}
public class FunctionalInterfaceDemo1  //implements Movable
{
	/*@Override
	public void move() {

      System.out.println("Car is moving.......");
		
	}*/ 

	public static void main(String[] args) {

		/*
		Movable m;
		m= new FunctionalInterfaceDemo1();
		m.move();
		*/
		
		Movable car= new Movable() {
			
			@Override
			public void move() {
				System.out.println("Car is moving..........");
				
			}
		};
		
		car.move();
		

		Movable ball= new Movable() {
			
			@Override
			public void move() {
				System.out.println("Ball is rolling..........");
				
			}
		};
		
		ball.move();
		
		
		// Lambda 
		
		Movable truck= ()->{System.out.println("Truck is moving at night....");};
		truck.move();
	}

}
