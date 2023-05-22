package Final_Test_Paper_1;


/*⦁	There is an array with every element repeated twice except one. Find that element?
e.g)  if given array is {1, 1, 2, 2, 3, 4, 4, 5, 5} then your program should return 3. 
*/
public class Q15
{
	   public static int findUnique(int[] nums) {
	        int result = 0;
	        for (int num : nums) {
	            result ^= num; 
	        }
	        return result;
	    }

	public static void main(String[] args) 
	{
		int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        int uniqueElement = findUnique(nums);
        System.out.println("Unique element: " + uniqueElement);

	}

}
