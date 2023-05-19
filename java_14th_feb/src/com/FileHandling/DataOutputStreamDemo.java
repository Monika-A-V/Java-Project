package com.FileHandling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {

	public static void main(String[] args) {

		try
		{
			File f = new File("D:\\tqppklogs\\MyFiles\\output.txt");
			
			if(!f.exists())
			{
				f.createNewFile();
				DataOutputStream dout= new DataOutputStream(new FileOutputStream(f));
				
				dout.writeInt(65);
                dout.writeChars("Shuruti");
                
                System.out.println("Data added........");
                dout.close();
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
