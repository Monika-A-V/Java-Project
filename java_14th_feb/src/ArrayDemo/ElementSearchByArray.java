package ArrayDemo;
import java.util.*;

public class ElementSearchByArray
{
	
	public static void SearchEle(int a[],int n)
	{
		
		boolean isPresent=false;
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
			
				isPresent=true;
				break;
			}
		}
	
		 if(isPresent==true) 
	        {
	            System.out.println("element is present : "+"index is :" +i);
	        } 
		 else 
	        {
	            System.out.println("element is not present");
	        }
	}
		public static void main(String[] args)
		{
			int a[] = {2,3,8,5,6,7,4};
	        System.out.println("array elements are : "+Arrays.toString(a));

	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter a element for searching");
	        int n= sc.nextInt();
	        ElementSearchByArray.SearchEle(a, n);
	       
		}
}

	/*public static void main(String[] args) 

	{
		int a[]= {2,3,8,5,6,7,4};
		System.out.println("array elements are : "+Arrays.toString(a));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a element for searching");
		int num=sc.nextInt();
		
		boolean isPresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				isPresent=true;
			}
		}
		if(isPresent)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}*/

