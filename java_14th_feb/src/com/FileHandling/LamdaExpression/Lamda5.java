package com.FileHandling.LamdaExpression;


@FunctionalInterface
interface Addition1
{
	int computeSum(int n1, int n2);
	 
	
}
public class Lamda5 {

	public static void main(String[] args) {

		
		Addition1 a1=(n1,n2)->((n1+n2));
		
		System.out.println("The sum is"+ a1.computeSum(34, 56));
		
		
		Addition1 a2=(int n1,int n2)->{
			System.out.println("First number:"+n1);
			System.out.println("Second number :"+n2);
			return (n1+n2);
			
		};
		
		System.out.println("The sum is :"+a2.computeSum(94, 76));
		
	}

}
