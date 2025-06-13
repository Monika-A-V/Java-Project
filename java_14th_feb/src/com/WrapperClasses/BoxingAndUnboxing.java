package com.WrapperClasses;

public class BoxingAndUnboxing {

	public static void main(String[] args)
	{

		byte b=10;    //primitive byte type
		Byte bobj=new Byte(b);    //Boxing
		System.out.println("byte data boxed/wrapped: "+bobj);
		Byte bobj1=b;   //auto boxing
		System.out.println("byte data autoboxed: "+bobj1);
		
		
		byte b1=bobj.byteValue();    //unboxing
		System.out.println("after unboxing byte object" + "byte value is : "+b1);
		byte b2=bobj;    //auto unboxing
		System.out.println("after auboxing byte object" + "byte value is : "+b2);
	
		
		int i=10;    //primitive int type
		Integer iobj=new Integer(i);    //Boxing
		System.out.println("int data boxed/wrapped: "+iobj);
		Integer iobj1=i;   //auto boxing
		System.out.println("int data autoboxed: "+iobj1);
		
		
		int i1=iobj.intValue();    //unboxing
		System.out.println("after unboxing integer object" + "int value is : "+i1);
		int i2=iobj1;    //auto unboxing
		System.out.println("after auboxing integer object" + "int value is : "+i2);
		
	}

}
