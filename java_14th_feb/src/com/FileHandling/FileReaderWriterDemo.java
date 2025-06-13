package com.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterDemo 
{
	public static void readFile(File f)
	{
		try
		{
			FileReader fr= new FileReader(f);
			
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void  writeFile(File f)
	{
		try
		{
		    FileWriter fw= new FileWriter(f);
		    fw.write("My Java programs");
		    fw.close();
		    
		    System.out.println("Data added...............");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) 
	{
		  File f= new File("D:\\tqppklogs\\MyFiles\\chardata.txt");
		  //writeFile(f);
          readFile(f);

	}
}