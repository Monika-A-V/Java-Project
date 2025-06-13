package com.Assignment_4;
/*Create a class Cycle with member variables: int accountNo, int noOfWheels
a. Create a default constructor with a write in it “I am default 
constructor”
b. Create another constructor which takes 2 arguments, calls the default 
constructor using this keyword and has a print in it “I am another 
constructor”.
c. In main method, create an object of type Cycle by using default 
constructor(Note the output)
d. Create another object of type Cycle by using the parameterized 
constructor( Note the sequence of print indicating that inner most 
constructor is called first*/

class Cycle
{
	int account_no;
	int noOfWheels;
	
	Cycle()
	{
		
		System.out.println("I am default constructor....");
	}
	Cycle(int ac_no,int nowheels)
	{
		this();
		System.out.println("i am another constructor....");
	}
}
public class Q9 {

	public static void main(String[] args) {

		//Cycle c= new Cycle();
				Cycle cc=new Cycle(67245618,4);
				//System.out.println(cc.account_no+" "+cc.noOfWheels);
				}
}
