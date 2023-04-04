package ArrayDemo;

public class ColumnMinValue2D 
{

	public static void main(String[] args) 
	{

        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		for(int x[]:arr)
		{
			for(int value:x)
			{
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		System.out.println("column min value = ");
        for (int i = 0; i < arr.length; i++)
        {
            int min = arr[0][i];
            
            for (int j = 1; j < arr[i].length; j++) 
            {
                if (arr[j][i] < min)
                {
                    min = arr[j][i];
                }
            }
          
        System.out.print(min+" ");
    }
}}


