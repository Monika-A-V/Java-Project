package Final_Test_Paper_1;

import java.util.Arrays;

/*⦁	To Find unique Pair Of Integers in Array whose Sum is Given Number [2M]
Given array : [2, 4, 3, 5, 6, -2, 4, 7, 8, 9]
Given sum : 7 Integer numbers, 
whose sum is equal to value : 7
(2, 5) (4, 3) (-2, 9) , (7)
*/
public class Q10 {

		    public static void findPairs(int[] arr, int targetSum) 
		    {
		        Arrays.sort(arr); 
		        int left = 0;
		        int right = arr.length - 1;
		        
		        while (left < right) 
		        {
		            int sum = arr[left] + arr[right];
		            
		            if (sum == targetSum) 
		            {
		                System.out.println("(" + arr[left] + ", " + arr[right] + ")");
		                left++;
		                right--;
		                
		                while (left < right && arr[left] == arr[left - 1]) 
		                {
		                    left++;
		                }
		                while (left < right && arr[right] == arr[right + 1]) 
		                {
		                    right--;
		                }
		            } 
		            else if (sum < targetSum)
		            {
		                left++;
		            }
		            else 
		            {
		                right--;
		            }
		        }
		    }
		    
		    public static void main(String[] args) 
		    {
		        int[] arr = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		        int targetSum = 7;
		        
		        System.out.println("Pairs whose sum is " + targetSum + ":");
		        findPairs(arr, targetSum);
		    }
		}