package com.FileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {


	      String data="Lets learn Java";
	      
	      try
	      {
	         File f= new File("D:\\tqppklogs\\MyFiles\\mydata2.txt");
	      
	         if(!f.exists())
	        {
	    	  f.createNewFile();
	    	  FileOutputStream fout = new FileOutputStream(f);
	    	  BufferedOutputStream bout= new BufferedOutputStream(fout);
	    	  
	    	  byte[] b= data.getBytes();
	    	  bout.write(b);
	    	  
	    	  System.out.println("Data added..........");
	    	  bout.close();
	    	  fout.close();
	    	  
	    	  
	        }
	      }
	      catch(Exception e)
	      {
	    	  System.out.println(e);
	      }

		}

	}