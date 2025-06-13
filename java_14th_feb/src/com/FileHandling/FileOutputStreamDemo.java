package com.FileHandling;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		String data="Welcome to Think Quotient";
	      
	      try
	      {
	    	  File f=new File("D:\\tqppklogs\\MyFiles\\mydata.txt");
	    	  if(!f.exists())
	    	  {
	    		  f.createNewFile();
	    		  FileOutputStream fout=new FileOutputStream(f);
	    		  byte[] b=data.getBytes();
	    		  fout.write(b);
	    		  
	    		  System.out.println("data added");
	    		  fout.close();
	    	  }
	      }
	      catch(Exception e)
	      {
	    	  System.out.println(e);
	      }
	      }

		}

	
