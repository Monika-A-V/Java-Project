package ArrayDemo;
import java.util.*;

public class AlternateChar
{

	public static void main(String[] args) 
	{
		char ch[]= {'A','a','Y','b','C','y','D','Z','E','Z','F'};
		System.out.println(Arrays.toString(ch));

		for(int i = 0; i < ch.length; i++) 
		{
		    if (ch[i] == 'z') 
		    {
		        ch[i] = 'b';
		    } else if (ch[i] == 'Z')
		    {
		        ch[i] = 'B';
		    } else if (ch[i] == 'y')
		    {
		        ch[i] = 'a';
		    } else if (ch[i] == 'Y') 
		    {
		        ch[i] = 'A';
		    } 
		    else 
		    {
		        if(ch[i]>='a' && ch[i]<='x') 
		        {
		            ch[i] = (char)(ch[i] + 2);
		        } 
		        else if (ch[i] >= 'A' && ch[i] <= 'X')
		        {
		            ch[i] = (char)(ch[i] + 2);
		        }
		    }
		}

		System.out.println(Arrays.toString(ch));

		
	}}
		/*char ch[]= {'a','b','c','d','e','y','Z'};
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]>='a' && ch[i]<='z' && ch[i]<=128)
		{
			if (ch[i] == 'y')
			{
	            ch[i] = 'a';
	        }
			else
	        {
	            ch[i]=(char)(ch[i]+2);
	        }
	    }
		
		else if(ch[i]>='A' && ch[i]<='Z' && ch[i]<=128)
		{
			if(ch[i] == 'Y')
			{
	            ch[i] = 'A';
	        }
			else
	        {
	            ch[i]=(char)(ch[i]+2);
	        }
	    }
		}


		System.out.println(Arrays.toString(ch));

}}*/