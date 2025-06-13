package com.CoreJava_Day3;

public class Movie
{
	float profit;
	String producerName;
	String actorName;
	int yearOfRelease;
	
	void acceptDetails(float p,String pr,String a,int y)
	{
		profit=p;
		producerName=pr;
		actorName=a;
		yearOfRelease=y;
	}
	void showDetails()
		{
		System.out.println("profit is "+profit);
		System.out.println("Producer name "+producerName);
		System.out.println("actor name "+actorName);
		System.out.println("year of release "+yearOfRelease);
		}
		
public static void main(String[] args)
	{
		Movie titanic=new Movie();
		titanic.showDetails();
		titanic.acceptDetails(200000,"vicky kaushal","Mr.james",1997);
		System.out.println("after calling accept details");
		titanic.showDetails();
		
		
		Movie uri=new Movie();
		titanic.showDetails();
		titanic.acceptDetails(300000,"katrina kaif","karan johar",1998);
		System.out.println("after calling accept details");
		titanic.showDetails();

	}

}
