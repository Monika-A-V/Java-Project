package StringDemo;

public class StringLiteral {

		public static void main(String[] args)
		{
			String s="hello";//scp
			System.out.println(s);//heap
			String s2=new String("Hello");
			System.out.println(s2);
			
		   String s3="hello";
		   char arr[]= {'h','e','l','l','o'};
		   String s4=new String(arr);
		   System.out.println(s4);
			
			if(s==s2)
			{
				System.out.println("String are equal");
			}
			else
				System.out.println("String are not equal");
			
			if(s.equals(s2))
			{
				System.out.println("String are equal");
			}
			else
				System.out.println("String are not equal");
			
			if(s.equalsIgnoreCase(s2))
			{
				System.out.println("String are equal");
			}
			else
				System.out.println("String are not equal");
			
					}
}
