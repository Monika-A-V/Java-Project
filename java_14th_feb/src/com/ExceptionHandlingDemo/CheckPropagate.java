package com.ExceptionHandlingDemo;
import java.io.*;

public class CheckPropagate 
{
	static void m1()
	{
		try
		{
		throw new IOException("device error");
	}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		}
	static void n1()
	{
		m1();
	}
	static void p1()
	{
		n1();
	}

	public static void main(String[] args) 
	{
		p1();
		System.out.println("hello");

		
	}

}
