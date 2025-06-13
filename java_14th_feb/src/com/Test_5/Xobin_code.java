package com.Test_5;
//write a program in java accept 10 integer in an array from user and merge 
//alternate even odd such that one even and one odd into new array.if either even
//or odd are not in equal ratio first do alternate merging and remaining add in the end.

import java.util.Arrays;
import java.util.Scanner;

public class Xobin_code
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();

		int[] b = new int[size];
		int[] a1 = new int[size];

		System.out.println("Enter array elements:");
		for (int i = 0; i < size; i++) {
		    b[i] = sc.nextInt();
		}

		for (int j = 0; j < b.length; j++) {
		    if (b[j] % 2 == 0) {
		        a1[j] = b[j] - 1;
		    } else {
		        a1[j] = b[j] + 1;
		    }
		}

		System.out.println("Alternate even and odd numbers:");
		for (int i = 0; i < size; i++) {
		    if (i % 2 == 0) {
		        System.out.print(a1[i] + " ");
		    } else {
		        System.out.print(b[i] + " ");
		    }
		}
}}