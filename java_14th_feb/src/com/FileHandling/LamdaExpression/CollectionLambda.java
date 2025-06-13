package com.FileHandling.LamdaExpression;

import java.util.ArrayList;

public class CollectionLambda {

	public static void main(String[] args) {

        ArrayList<String> list=  new ArrayList<>();
  		
		list.add("Jay");
		list.add("Nikhil");
		list.add("Monika");
		list.add("Preeti");
		
		list.forEach((n)->System.out.println(n.toUpperCase()));
	
	}

}
