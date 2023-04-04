package ArrayDemo;

public class OccuranceOfChar 
{

	public static void main(String[] args) 
	{
		    {
		        char[] arr = {'a', 'b','C','A','d','C','a','a'};
		        int max=0;
		        for(int i=0;i<arr.length;i++)
		        {
		        	int count=1;
		        	for(int j=i+1;j<arr.length;j++)
		        	{
		        		if(arr[i]==arr[j])
		        		{
		        			count++;
		        			arr[j]=' ';
		        		}
		        	}
		        	if(arr[i]!=' ')
		        	{
		        		System.out.println(arr[i]+" "+count);
		        		if(max<count)
		        		{
		        			max=count;
		        		}
		        	}
		        }
		        	System.out.println("max count is : "+max);
		        }
		        /*int[] count = new int[256]; 

		        for (int i = 0; i < arr.length; i++) 
		        {
		            count[arr[i]]++;
		        }

		        for (int i = 0; i < 256; i++) 
		        {
		            if (count[i] > 0) 
		            {
		                System.out.println((char)i + " : " + count[i]); 
		            }
		        }*/
		    }
		}
