package com.Java8Features;

@FunctionalInterface
interface MyInterface
{
	int add(int a,int b);
	default int sum(int a,int b)
	{
		return a*2+b*2;
	}
}
@FunctionalInterface
interface MyInterface2
{
	void display(String s);
}
/*public class FunctionalInterface1 implements MyInterface

{
	public int add(int a,int b)
	{
		return a+b;
}*/
public class FunctionalInterface1
{
	public static void main(String[] args) 
	{
		//using anonymous inner class
		/*MyInterface i1=new MyInterface() {//anonymous inner class
		
		public int add(int a,int b)
		{
			return a+b;
		}
		};
      System.out.println(i1.add(4,5));*/
	//.......................................................
		//using lamda
		MyInterface i2=(int a,int b)->{return a+b;};
		System.out.println(i2.add(4, 5));
		
		MyInterface2 ref=(str)->{System.out.println("string length is : "+str.length());};
		ref.display("thinkquotient");
	}
}