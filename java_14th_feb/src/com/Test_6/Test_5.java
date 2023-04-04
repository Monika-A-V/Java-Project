package com.Test_6;

//WAP to print all unique elements in the array.
public class Test_5 {

	public static void main(String[] args) {
		        
		int[] arr = {1, 2, 3, 2, 4, 1, 3, 5, 6, 5};
        int[] counts = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            counts[i] = count;
        }

        System.out.println("unique elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                if (counts[i] == 1) {
                    System.out.println(arr[i]);
                }
                }}
        }}