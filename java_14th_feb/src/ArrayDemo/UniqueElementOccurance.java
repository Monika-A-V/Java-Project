
package ArrayDemo;

public class UniqueElementOccurance {

	public static void main(String[] args) {


		/*int[] arr = {1, 2, 9, 4, 5, 2, 3, 4, 6};
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	int count=1;
		    boolean isVisited=false;
        for(int k=i-1;k>=0;k--)
        {
        	if(arr[i]==arr[k])
        	{
        		isVisited=true;
        		break;
        	}
        }
        if(isVisited==false)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			count++;
        		}
        		
        	}
        	if(count==1)
        	{
        	System.out.println(arr[i]+" "+count);
        }
	    }
	    
	}*/
		 int[] arr = {1, 2, 3, 2, 4, 1, 3, 5, 6, 5};
	        int[] counts = new int[arr.length];

	        for (int i = 0; i < arr.length; i++) {
	            int count = 0;
	            for (int j = 0; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }
	            counts[i] = count;
	        }

	        System.out.println("Count of each unique element in the array:");
	        for (int i = 0; i < arr.length; i++) {
	            boolean isUnique = true;
	            for (int j = 0; j < i; j++) {
	                if (arr[i] == arr[j]) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                if (counts[i] == 1) {
	                    System.out.println(arr[i] + " occurs " + counts[i] + " time.");
	                }
	                /*else {
	                    System.out.println(arr[i] + " occurs " + counts[i] + " times.");
	                }*/
	            }
	        }}}