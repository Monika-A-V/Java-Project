package StringDemo;

import java.util.Arrays;

public class StringPattern {

	public static void main(String[] args) {

		String s="i like India Country";
		
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str[j]+" ");
			}
		
		System.out.println();
	}

}
}