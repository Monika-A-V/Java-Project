package com.Test_2;
import java.util.*;
//WAP to accept mobile number and count frequency of digit
public class Test_1 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		long temp;
		System.out.println("enter mobile number");
		long num=sc.nextLong();
		
		
		for(int i=0;i<=9;i++)
		{
			int count=0;
			temp=num;
			while(temp>0)
			{
				long digit=temp%10;
				
				if(digit==i)
				{
					count++;
				}
				temp=temp/10;
				
			}
			if(count>0)
			{
			
				System.out.println(i+"\t "+count);
			
					
		}
		
		/*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mobile number: ");
        String m = scanner.nextLine();
        char[] ch=m.toCharArray();

        for (int i = 0; i <ch.length; i++)
        {
            int count = 1;
            for (int j = i+1; j <ch.length; j++)
            {
                if (ch[i]==ch[j])
                {
                	count++;
                	ch[j]='$';
            }}
            if (ch[i]!='$') 
            {
                System.out.println("occurance of char : " +ch[i]+" "+count);
            }
        }*/
    }


		
	}}


