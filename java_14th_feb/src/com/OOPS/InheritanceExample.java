package com.OOPS;

class Vehicle
{
    public int speed;
    public String color;
    public String model;
    public int numOfWheels;

    public void start() 
    {
        System.out.println("Vehicle started.");
    }
}
class Car extends Vehicle 
{
	int numOfDoors;

    public void accelerate() 
    {
        System.out.println("Car is accelerating.");
    }

    public void brake()
    {
        System.out.println("Car is braking.");
    }

    public void steer() 
    {
        System.out.println("Car is steering.");
    }
}

class Bike extends Vehicle 
{
	String name;

    public void pedal() 
    {
        System.out.println("Bike is pedaling.");
    }

    public void brake() 
    {
        System.out.println("Bike is braking.");
    }

    public void turn()
    {
        System.out.println("Bike is turning.");
    }
}

class Truck extends Vehicle 
{
    int doors;
    public void load()
    {
        System.out.println("Truck is loading cargo.");
    }

    public void unload() 
    {
        System.out.println("Truck is unloading cargo.");
    }

    public void haul()
    {
        System.out.println("Truck is hauling cargo.");
    }
}

public class InheritanceExample
{
  public static void main(String[] args)
  {
		        Car car = new Car();
		        car.color = "red";
		        car.model = "sedan";
		        car.numOfWheels = 4;
		        car.numOfDoors = 4;

		        car.start();
		        car.accelerate();
		        car.brake();
		        car.steer();

		        Bike bike = new Bike();
		        bike.color = "blue";
		        bike.model = "mountain";
		        bike.numOfWheels = 2;
		        bike.name="R15";

		        bike.start();
		        bike.pedal();
		        bike.brake();
		        bike.turn();

		        Truck truck = new Truck();
		        truck.color = "green";
		        truck.model = "semi-truck";
		        truck.numOfWheels = 18;
		        truck.doors=2;

		        truck.start();
		        truck.load();
		        truck.haul();
		        truck.unload();
		    }
		}