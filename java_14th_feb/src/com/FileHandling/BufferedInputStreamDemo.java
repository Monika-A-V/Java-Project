package com.FileHandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {

		 try
		    {    	
		    	  File f= new File("D:\\tqppklogs\\MyFiles\\mydata2.txt");
		    	  if(f.exists())
		    	  {
		    		  BufferedInputStream bin= new BufferedInputStream(new FileInputStream(f));
		    		  int i=0;
		    		  
		    		  while((i=bin.read())!=-1)
		    		  {
		    			  System.out.print((char)i);
		    		  }
		    		  
		    		  bin.close();
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

			}

		}