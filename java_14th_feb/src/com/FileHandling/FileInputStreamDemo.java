package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		try
	    {    	
	    	  File f= new File("D:\\tqppklogs\\MyFiles\\mydata.txt");
	    	  if(f.exists())
	    	  {
	    		  FileInputStream fin = new FileInputStream(f);
	    		  int i=0;
	    		  
	    		  while((i=fin.read())!=-1)
	    		  {
	    			  System.out.print((char)i);
	    		  }
	    		  
	    		  fin.close();
	    	  }
	    	  else
	    	  {
	    		  System.out.println("File doesnot exist........");
	    	  }
	    	
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }

		}}