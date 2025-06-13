package Final_Test_Paper_1;

//⦁	Print Following Pascals Triangle		
/*                         1
                        1     1
                     1     2    1
                  1     3     3    1
                1    4     6    4    1
             1     5    10   10    5   1
           1    6    15    20   15   6    1      */

public class Q7 {

	public static void main(String[] args)
	{
		        int numRows = 7;
		        int[][] triangle = new int[numRows][numRows];

		        for (int i = 0; i < numRows; i++)
		        {
		            for (int j = 0; j < numRows - i; j++) 
		            {
		                System.out.print("  ");
		            }
		            for (int j = 0; j <= i; j++)
		            {
		                if (j == 0 || j == i)
		                {
		                    triangle[i][j] = 1;
		                }
		                else 
		                {
		                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
		                }
		                System.out.print(triangle[i][j] + "   ");
		            }
		            System.out.println();
		        }
		    }
		}