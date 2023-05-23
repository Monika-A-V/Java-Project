package Final_Test_Paper_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on.
 *  Create a map which has alphabets as keys and integers as values. 
 *  If alphabet is repeated add integer to old value*/

public class Q3 {

	public static void main(String[] args) {

		 List<String> arrayList = new ArrayList<>();
	        arrayList.add("A+2");
	        arrayList.add("B+12");
	        arrayList.add("D+4");
	        arrayList.add("DD+5");

	        Map<String, Integer> map = new HashMap<>();

	        for (String entry : arrayList)
	        {
	            String[] parts = entry.split("\\+"); 
	            String alphabet = parts[0];
	            int value = Integer.parseInt(parts[1]);

	            if (map.containsKey(alphabet))
	            {
	                int existingValue = map.get(alphabet);
	                map.put(alphabet, existingValue + value);
	            } 
	            else 
	            {
	                map.put(alphabet, value);
	            }
	        }

	        for (Map.Entry<String, Integer> entry : map.entrySet())
	        {
	            System.out.println(entry.getKey() + " => " + entry.getValue());
	        }
	    }
	}
