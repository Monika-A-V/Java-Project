package Final_Test_Paper_2;

/*Write a program which calculates average of each column of two dimensional array.
 * Also calculate max of all numbers.e.g. If array is {{2,4,9,7} , {6,5,3,10}
 *  {7,3,6,4}} average of each column will be column1 =5 , column2 = 4, column3= 6,
 *   column4 = 7. Max element is 10*/

public class Q6 {

	public static void main(String[] args)
	{
		 int[][] array = {{2, 4, 9, 7}, {6, 5, 3, 10}, {7, 3, 6, 4}};

	        int rows = array.length;
	        int cols = array[0].length;

	        int[] columnSum = new int[cols];
	        for (int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < cols; j++) 
	            {
	                columnSum[j] += array[i][j];
	            }
	        }

	        double[] columnAverage = new double[cols];
	        for (int j = 0; j < cols; j++)
	        {
	            columnAverage[j] = (double) columnSum[j] / rows;
	        }

	        int maxElement = array[0][0];
	        for (int i = 0; i < rows; i++) 
	        {
	            for (int j = 0; j < cols; j++) 
	            {
	                if (array[i][j] > maxElement)
	                {
	                    maxElement = array[i][j];
	                }
	            }
	        }

	        System.out.println("Average of each column:");
	        for (int j = 0; j < cols; j++)
	        {
	            System.out.println("Column " + (j + 1) + ": " + columnAverage[j]);
	        }

	        System.out.println("Maximum element: " + maxElement);
	    }
	}