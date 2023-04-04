package StringDemo;

public class AverageOfDigitFromString {

	public static void main(String[] args) {

		String s="p2u4ne5";
		int sum=0;
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0' && c<='9')
			{
				
		     int digit=Character.getNumericValue(c);
			/*if(Character.isDigit(c))
		{
			int digit=Character.getNumericValue(c);*/
			sum=sum+digit;
			count++;
		}
		}
		double average=(double)sum/count;
		System.out.println("average of digit :" +average+ "sum is = "+sum);
	}

}
