package com.Test_4;

/*WAP to print maximum in rowwise in 2D array. Means e.g. arr[][] {{22, 31, 9}, {12, 25, 16}} output is: 31 and 25*/

public class Test_12 {

	public static void main(String[] args) {

        int[][] arr = {{22,31,9},{12,25,16}};
		
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
