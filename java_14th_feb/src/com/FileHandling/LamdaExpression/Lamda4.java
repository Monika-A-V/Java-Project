package com.FileHandling.LamdaExpression;


@FunctionalInterface
interface Addition
{
	void computeSum(int n1, int n2);
	 
	
}
public class Lamda4 {

	public static void main(String[] args) {

		Addition a1=(n1,n2)->{
			System.out.println("The sum is:"+(n1+n2));
		};
		
		a1.computeSum(34, 56);
		
		Addition a2=(int n1,int n2)->{
			System.out.println("The sum is:"+(n1+n2));
		};
		
		a2.computeSum(14, 76);
	
	}

}
