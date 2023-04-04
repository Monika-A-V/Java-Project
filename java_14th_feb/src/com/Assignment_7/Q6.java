package com.Assignment_7;

public class Q6 {

	public static void main(String[] args) {

		int a[]=new int[] {2,4,5,6,8,9,7};
		int sum=0;
		int product=1;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			product=product*a[i];
		}
		System.out.println("sum is : " +sum+"\nproduct is : " +product);
	}

}
