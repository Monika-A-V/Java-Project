package ArrayDemo;

public class SparxMatrix2D {

	public static void main(String[] args) 
	{
		int[][] sparxMatrix = new int[4][4];

		for (int i = 0; i < sparxMatrix.length; i++) 
		{
		    for (int j = 0; j < sparxMatrix[i].length; j++)
		    {
		        if (i == j || i + j == sparxMatrix.length - 1)
		        {
		            sparxMatrix[i][j] = 1;
		        }
		        else
		        {
		            sparxMatrix[i][j] = 0;
		        }
		    }
		}

		for (int i = 0; i < sparxMatrix.length; i++)
		{
		    for (int j = 0; j < sparxMatrix[i].length; j++) 
		    {
		        System.out.print(sparxMatrix[i][j] + " ");
		    }
		    System.out.println();
		}


	}

}
