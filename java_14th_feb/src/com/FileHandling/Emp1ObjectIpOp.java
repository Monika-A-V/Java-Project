package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Emp1ObjectIpOp 
{
	
	public static void addEmployee(File f)
	{
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
				ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(f));
				
				Employee1 e1= new Employee1(101, "Vaibhav", 67000f);
				
				oout.writeObject(e1);
				
				System.out.println("Employee added........");
				
				oout.close();
				
			}
			else {
				
				System.out.println("File exists............");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
	public static void readEmployee(File f)
	{		
		try
		{
            if(f.exists())
            {
            	ObjectInputStream oin = new ObjectInputStream(new FileInputStream(f));
            	Employee1 e=(Employee1) oin.readObject();
            	System.out.println(e);
            	
            	oin.close();
            	
            	
            }
            else
            {
            	System.out.println("File doesnot exists........");
            }
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args)
	{
		File f= new File("D:\\tqppklogs\\MyFiles\\empdata1.txt");
		addEmployee(f);
        readEmployee(f);

	}

}
