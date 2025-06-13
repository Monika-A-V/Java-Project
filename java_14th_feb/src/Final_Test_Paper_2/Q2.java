package Final_Test_Paper_2;

import java.util.ArrayList;

/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. 
 * Create a method which accepts a character String eg D in input and 
 * will return associated number value eg in this case 4 by looping the 
 * arraylist and finding matching pattern*/

public class Q2 {

	public static void main(String[] args)
	{

		    ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("A+2");
	        arrayList.add("B+12");
	        arrayList.add("D+4");
	        arrayList.add("DD+5");

	        String input = "A";
	        int associatedNumber = findAssociatedNumber(arrayList, input);
	        System.out.println("Associated number: " + associatedNumber);
	    }

	    public static int findAssociatedNumber(ArrayList<String> arrayList, String input)
	    {
	        for (String item : arrayList)
	        {
	            if (item.startsWith(input + "+"))
	            {
	                String[] parts = item.split("\\+");
	                if (parts.length == 2)
	                {
	                    return Integer.parseInt(parts[1]);
	                }
	            }
	        }
	        return -1; // Return -1 if no matching pattern is found
	    }
	}
