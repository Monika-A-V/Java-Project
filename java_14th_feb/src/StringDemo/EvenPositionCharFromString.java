package StringDemo;

public class EvenPositionCharFromString {

	public static void main(String[] args) 
	{
       String s="monika  avhad";
       
       char ch[]=s.toCharArray();
       
       for(int i=1;i<ch.length;i=i+2)
       {
    	   System.out.print(ch[i]+" ");
       }
		
       System.out.println();
         String str = "Hello World";
        
        for(int i=1; i<str.length(); i=i+2) 
        {
            System.out.print(str.charAt(i) + " ");
        }
    }
	}

