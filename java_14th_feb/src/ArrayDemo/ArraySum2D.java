package ArrayDemo;

import java.util.Scanner;

public class ArraySum2D
{

	public static void main(String[] args) 
	{
	
		        Scanner input = new Scanner(System.in);
		         System.out.println("Enter values for arr1:");
		        int[][] arr1 = new int[3][3];
		        for (int i = 0; i < arr1.length; i++)
		        {
		            for (int j = 0; j < arr1[0].length; j++)
		            {
		                arr1[i][j] = input.nextInt();
		            }
		        }
		        System.out.println("Enter values for arr2:");
		        int[][] arr2 = new int[3][3];
		        for (int i = 0; i < arr2.length; i++) 
		        {
		            for (int j = 0; j < arr2[0].length; j++) 
		            {
		                arr2[i][j] = input.nextInt();
		            }
		        }
		        
		        int[][] sum = new int[arr1.length][arr1[0].length];
		        for (int i = 0; i < arr1.length; i++) 
		        {
		            for (int j = 0; j < arr1[0].length; j++) 
		            {
		                sum[i][j] = arr1[i][j] + arr2[i][j];
		            }
		        }
		        
		       
		        System.out.println("Sum of arrays:");
		        for (int i = 0; i < sum.length; i++) 
		        {
		            for (int j = 0; j < sum[0].length; j++) 
		            {
		                System.out.print(sum[i][j] + " ");
		            }
		            System.out.println();
		        }
		        
		         }
		}

		       /* int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		        int[][] arr2 = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

		        int[][] sum = new int[arr1.length][arr1[0].length];

		        
		        for (int i = 0; i < arr1.length; i++)
		        {
		            for (int j = 0; j < arr1[0].length; j++) 
		            {
		                sum[i][j] = arr1[i][j] + arr2[i][j];
		            }
		        }

		        System.out.println("Sum of arrays:");
		        for (int i = 0; i < sum.length; i++) 
		        {
		            for (int j = 0; j < sum[0].length; j++) 
		            {
		                System.out.print(sum[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}*/

	
