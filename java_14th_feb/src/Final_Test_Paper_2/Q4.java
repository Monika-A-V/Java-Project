package Final_Test_Paper_2;

import java.util.Arrays;

/*Shift all 0s in array to the end. E.g. if array is {1,5,0 ,6,0,4}
 *  output should be {1,5,6,4,0,0}*/

public class Q4 {

	public static void main(String[] args) {

		int a[]= {1,5,0,6,0,4};
		int size=a.length;
		System.out.println("original array : " +Arrays.toString(a));
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]>0)
			{
				a[count]=a[i];
				count++;
			}
		}
		while(count<size)
		{
			a[count]=0;
			count++;
		}
		for(int i=0;i<size;i++)
		{
			//System.out.println(Arrays.toString(a)+" ");
		}

	     System.out.println("all zeros at end : " +Arrays.toString(a));
	}}