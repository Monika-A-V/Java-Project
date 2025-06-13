package com.FileHandling;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) {


		   try
		     {
		    	 RandomAccessFile rf= new RandomAccessFile("D:\\tqppklogs\\MyFiles\\chardata.txt", 
		    			 "rw");
		    	 rf.writeInt(16);
		    	 rf.writeUTF("Shuruti");
		    	 rf.writeFloat(89.6f);
		    	 rf.writeChar('A');
		    	 rf.readUTF();
		    	 System.out.println("Marks:"+rf.readFloat());
		    	 System.out.println("Grade:"+rf.readChar());
		    	 
		    	 rf.close();
		    	 
		    	 rf.seek(0);
		    	 
		    	 System.out.println("RollNo:"+rf.readInt());
		    	 System.out.println("FirstName:"+rf);
		    	 
		     }
		     catch(Exception e)
		     {
		    	 System.out.println( e);
		     }
		
	}

		}
	