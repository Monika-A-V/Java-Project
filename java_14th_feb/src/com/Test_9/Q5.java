package com.Test_9;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to update specific array element by given element

public class Q5 {

	public static void main(String[] args) {

		List<String> l=new ArrayList<>();
		
		l.add("red");
		l.add("blue");
		l.add("black");
		l.add("green");
		System.out.println(l);
		
		l.set(2,"yellow");
		System.out.println(l);
	}

}
