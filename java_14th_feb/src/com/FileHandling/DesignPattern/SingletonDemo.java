package com.FileHandling.DesignPattern;

public class SingletonDemo
{
	// rule 1
		private static SingletonDemo sobj= new SingletonDemo();
		
		public String msg;
		
		// rule 2:
		
		private SingletonDemo()
		{
			msg="Welcome";
		}
		
		// rule 3:
		
		public static SingletonDemo getInstance()
		{
			if(sobj==null)
				sobj= new SingletonDemo();
			
			return sobj;
		}

		public static void main(String[] args) {
			
			SingletonDemo s1= SingletonDemo.getInstance();
			SingletonDemo s2= SingletonDemo.getInstance();
			SingletonDemo s3= SingletonDemo.getInstance();
			
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			System.out.println(s3.hashCode());
			
			s1.msg="Hello";
			
			System.out.println(s1.msg);
			System.out.println(s2.msg);
			System.out.println(s3.msg);
			
		}
		
	}