package ArrayDemo;

public class NPattern2DArray {

	public static void main(String[] args)
	{

      int arr[][]= {{1,2,3,4},{5,6,7,8},{9,1,3,6},{4,3,2,1}};
	
		
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<4;j++)
			{
				
				if(j==0  || i==j ||  j==arr.length-1)
				{
					System.out.print(arr[i][j]);
				}
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}


	}

