package ArrayDemo;

public class PrimeNumberInArray {

	public static void main(String[] args)
	{
		
		        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		        System.out.println("Prime numbers in the given array are:");
		        for (int num : arr) 
		        {
		            boolean isPrime = true;
		            if (num <= 1)
		            {
		                isPrime = false;
		            } 
		            else 
		            {
		                for (int i = 2; i * i <= num; i++) 
		                {
		                    if (num % i == 0) 
		                    {
		                        isPrime = false;
		                        break;
		                    }
		                }
		            }
		            if (isPrime==true)
		            {
		                System.out.print(num + " ");
		            }
		        }
		    }
        }


