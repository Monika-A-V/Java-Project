package com.CollectionMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MultiValueDemo {

	public static void main(String[] args) {

      HashMap<String,ArrayList<String>> hm=new HashMap();
      
      
      Scanner sc=new Scanner(System.in);
      
      for(int i=1;i<=3;i++)
      {
    	  System.out.println("enter key");
    	  String key=sc.next();
    	  
    	  ArrayList<String> al=new ArrayList();
    	  for(int j=1;j<=2;j++)
    	  {
    		  System.out.println("enter city");
    		  al.add(sc.next());
    	  }
    	  hm.put(key,al);
      }
      System.out.println(",,,,,,,,,,,,,,,");
      System.out.println(hm);
      /*ArrayList<String> al=new ArrayList();
      al.add("pune");
      al.add("mumbai");
      
      ArrayList<String> al2=new ArrayList();
      al2.add("bhopal");
      al2.add("jaipur");
      
      hm.put("Maharashtra", al);
      
      hm.put("MP",al2);
      System.out.println(hm);*/
      
	}

}
