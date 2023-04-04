package StringDemo;

public class StringAllMethods {

	public static void main(String[] args)
	{
		
		//1.length
		String myString = "Hello, World!";
		int length = myString.length();
		System.out.println("1."+length);
		
		//2.charAt(int Index)
		String myString1 = "Hello, World!";
		char firstChar = myString1.charAt(0); 
		System.out.println("2."+firstChar);
		
		//3.substring(int beginIndex, int endIndex)
		String myString2 = "Hello, World!";
		String substring = myString2.substring(0, 5); 
		System.out.println("3."+substring);
		
		//4.equals(Object obj)
		String myString3 = "Hello, World!";
		boolean isEqual = myString3.equals("Hello, World!");
		System.out.println("4."+isEqual);
		
		//5.toLowerCase()
		String myString4 = "Hello, World!";
		String lowercase = myString4.toLowerCase();
		System.out.println("5."+lowercase);
		
		//6.toUpperCase()
		String myString5 = "Hello, World!";
		String uppercase = myString5.toUpperCase();
		System.out.println("6."+uppercase);
		
		//7.replace(char oldChar, char newChar)
		String myString6 = "Hello, World!";
		String replaced = myString6.replace('o', '0');
		System.out.println("7."+replaced);
		
		//8.copncat()
		String s="Sachin";  
		s=s.concat(" Tendulkar");
		System.out.println("8."+s);

		//9.equals()
		String s1="Sachin";  
		String s2="Sachin";  
		String s3=new String("Sachin");  
		String s4="Saurav";  
		System.out.println("9."+s1.equals(s2));
		System.out.println("9."+s1.equals(s3));
		System.out.println("9."+s1.equals(s4));

		//10.equalIgnoreCase()
		 String a="Sachin";  
		 String a1="SACHIN";  
		 System.out.println("10."+a.equals(a1));
		 System.out.println("11."+a.equalsIgnoreCase(a1));
		 
		 //12.(==)operator
		 String b="Sachin";  
		  String b1="Sachin";  
		  String b2=new String("Sachin");  
		  System.out.println("12."+b==b1);
		  System.out.println("12."+b==b2); 
		  
		  //13.compareTo()
		  String c="Sachin";  
		  String c1="Sachin";  
		  String c2="Ratan";  
		  System.out.println("13."+c.compareTo(c1));//0  
		  System.out.println("13."+c.compareTo(c2));//1  
		  System.out.println("13."+c2.compareTo(c));//-1
		  
		  //14.concat
		  String c3="Sachin"+" Tendulkar";  
		  System.out.println("14."+c3);
		  
		  String c4=50+30+"Sachin"+40+40;  
		  System.out.println("14."+c4);//80Sachin4040
		  
		  String c5="Sachin ";  
		  String c6="Tendulkar";  
		  String c7=c5.concat(c6);  
		  System.out.println("14."+c7);
		  
		  //15.substring()
		  String c8="SachinTendulkar";    
		  System.out.println("15.Original String: " + c8);  
		  System.out.println("15.Substring starting from index 6: " +c8.substring(6));//Tendulkar    
		  System.out.println("15.Substring starting from index 0 to 6: "+c8.substring(0,6)); 
		  
		  //16.split()
		  String sentence = "Hello, world! How are you?";
		  String[] words = sentence.split(", |\\s");
		  for (String word : words) {
		      System.out.println("16."+word);
		  }
	
		  //17.trim()
		  String d="  Sachin  ";    
		  System.out.println("17."+d);    
		  System.out.println("17."+d.trim());
		  
		  //18.charAt()
		  String d1="Sachin";    
		  System.out.println("18."+d1.charAt(0));
		  System.out.println("18."+d1.charAt(3));   
		  
		  //19.valueOf()
		  int a3=10;    
		  String s7=String.valueOf(a3);    
		  System.out.println("19."+s7+10);  
		  
		  //20.replace()
		  String s8="Java is a programming language.Java is a platform.";      
		  String replaceString=s8.replace("Java","Kava");     
		  System.out.println("20."+replaceString);    
}}
