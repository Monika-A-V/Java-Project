package ArrayDemo;

public class DuplicateElementOccurance {

	public static void main(String[] args) 
	{
                int[] array = {1, 2, 3, 4, 5, 2, 4, 6, 7, 3};

		        System.out.println("Duplicate elements in the array are: ");

		        for(int i = 0; i < array.length; i++) 
		        {
		            int count = 1;
		            for(int j = i+1; j < array.length; j++)
		            {
		                if(array[i] == array[j])
		                {
		                    count++;
		                }
		            }

		            if(count>1) 
		            {
		            	System.out.println(array[i]);
		                //System.out.println("Element " + array[i] + " occurs " + count + " times.");
		            }
		        }
		    }
		}
