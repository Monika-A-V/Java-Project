package com.Logical_Programs;
import java.util.*;

public class BinaryToDecimal
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter binary number");
		int n=sc.nextInt();
		int num=n;
		int decimal=0;
		int base=1;
		int temp=num;
		
		while(temp>0)
		{
			int last_digit=temp%10;
			temp=temp/10;
			decimal=decimal+last_digit*base;
			base=base*2;
		}
		System.out.println(decimal);
			
		}
		

}



/*int sum=0;
int p=0;
int m=0;

while(n>0)
{
	int digit=n%10;
	int power=1;
	
	for(int i=1;i<=p;i++)
	{
		power=power*2;
	}
	m=digit*power;
	sum=sum+m;
	p++;
	n=n/10;
}
System.out.println(sum);*/







