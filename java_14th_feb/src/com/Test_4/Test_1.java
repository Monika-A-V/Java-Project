package com.Test_4;

//create a Array of integer and count the number of even  and odd elements from array.
public class Test_1 {

	public static void main(String[] args) {

		int a[]= {2,3,7,6,9,8,1,10};
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
			}
			else if(a[i]%2!=0)
			{
				oddcount++;
			}
		}
		System.out.println("even element : " +evencount);
		System.out.println("odd element : " +oddcount);
	}

}
