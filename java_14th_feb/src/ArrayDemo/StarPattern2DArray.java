package ArrayDemo;

/*
*       
* *     
* * *   
* * * * 
*/

public class StarPattern2DArray
{

	public static void main(String[] args)
	{
        int n = 4; 
        int[][] p = new int[n][n];
        
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                p[i][j] = 1;
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                if (p[i][j] == 1) 
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
	
