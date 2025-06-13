package com.ExceptionHandlingDemo;

public class HandleMultiCatch {

	public static void main(String[] args) {

		try
		{
			int a[]={2,3,4};
			System.out.println(a[6]/0);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		/*catch(IndexOutOfBoundsException e)
		{
			//e.printStackTrace();
			System.out.println(e);
		}*/
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("hello java");
	}

}
