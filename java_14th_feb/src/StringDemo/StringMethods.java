package StringDemo;

public class StringMethods {	
	
	void leng(String s)
	{
		char ch[]=s.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		
		StringMethods sm=new StringMethods();
		String s="java programming";
		
		int len=s.length();
		System.out.println(len);
	
	    sm.leng(s);
	    
	    
	   System.out.println( s.concat(" langauage"));

}
}
