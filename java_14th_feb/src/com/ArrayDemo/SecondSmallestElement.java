package com.ArrayDemo;

public class SecondSmallestElement {

	public static void main(String[] args) 
	{

		int a[]= {8,1,4,9,2,5,7,6};
		int a1=a.length;
		int temp=0;
		for(int i=0;i<a1;i++)
		{
			for(int j=i+1;j<a1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("second highest element : " +a[a1-6]);
	}

}
