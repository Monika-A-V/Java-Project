package ArrayDemo;

import java.util.Arrays;

public class RowMaxValue2D {

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
		
		System.out.println("row max value = ");
        for (int i = 0; i < arr.length; i++)
        {
            int max = arr[i][0];
            
            for (int j = 1; j < arr[i].length; j++) 
            {
                if (arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
          
        System.out.print(max+" ");
    }


}
}