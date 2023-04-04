package ArrayDemo;
import java.util.*;

public class AlternateElementFromArray 
{

	public static void main(String[] args) 
	{
		int a[]= {1,3,4,5,6,8,7,9,1};
		System.out.println("array elements : " +Arrays.toString(a));
		
		System.out.println("alternate elements");
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}

	}

}
