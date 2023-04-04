package ArrayDemo;
import java.util.Arrays;

public class MergingTwoArrayInThirdArray 
{

	public static void main(String[] args) 
	{
                int[] a1 = {1, 2, 3, 4};
                System.out.println("first array : " +Arrays.toString(a1));
		        int[] a2 = {5, 6, 7, 8};
                System.out.println("second array : " +Arrays.toString(a2));

		        int[] mergedArray = new int[a1.length + a2.length];
		        
		        for (int i = 0; i < a1.length; i++)
		        {
		            mergedArray[i] = a1[i];
		        }
		        
		        for (int i = 0; i < a2.length; i++) 
		        {
		            mergedArray[a1.length + i] = a2[i];
		        }
		        
		        for (int i = 0; i < mergedArray.length; i++)
		        {
		        
		        }
	            System.out.print("merged array : " +Arrays.toString(mergedArray) );

		    }
		}

