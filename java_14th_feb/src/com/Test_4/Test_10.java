
package com.Test_4;

import java.util.Arrays;

/*) Arr is a two dimensional array as follows. 
Arr = { { 1,2,3,4} , {5,6,7,8}}
Create a new array ArrCopy which should be as follows
ArrCopy = {{4,3,2,1} , { 8,7,6,5}
*/

public class Test_10 {

	public static void main(String[] args) {

		int[][] Arr = { {1, 2, 3, 4}, {5, 6, 7, 8} };
		System.out.println(Arrays.deepToString(Arr));
		int[][] ArrCopy = new int[Arr.length][Arr[0].length];

		for(int i = 0; i < Arr.length; i++) {
		    int start = 0;
		    int end = Arr[i].length - 1;
		    while (start <= end) 
		    {
		        ArrCopy[i][start] = Arr[i][end];
		        ArrCopy[i][end] = Arr[i][start];
		        start++;
		        end--;
		    }
		}

		System.out.println(Arrays.deepToString(ArrCopy));

	}

}
