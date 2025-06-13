package com.Logical_Programs;

public class PairSumIs6 {

	public static void main(String[] args) {

		int num,lastdigit,sum;
		for(int i=1;i<=100;i++)
		{
			lastdigit=i%10;
			num=i/10;
			sum=lastdigit+num;
			if(sum==6)
			{
				System.out.println(i);
			}
		}
	}

}
