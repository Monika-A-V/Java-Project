package com.FileHandling;

import java.io.File;

public class FileProperties {

	public static void main(String[] args) {

		 File f= new File("D:\\tqppklogs\\MyFiles\\mydata.txt");
		//File f= new File("D:\\tqppklogs\\MyFiles\\"); 
		
		 if(f.exists())
		 {
			 if(f.isFile())
			 {
				 System.out.println("File name:"+f.getName());
				 System.out.println("Path:"+f.getAbsolutePath());
				 System.out.println("File length:"+f.length());
				 System.out.println("Check write:"+f.canWrite());
				 
			 }
			 
			 else
			 {
				 System.out.println("Its a directory...");
			 }
			 
		 }}}