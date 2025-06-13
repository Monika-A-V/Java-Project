package com.Test_10;

import java.util.Scanner;

/*Convert following conditions into ternary statement 
If ( score < 40000 )
If ( score < 25000 )
then sysout ( “ bronze “ ) ; else sysout(“silver” );
else if ( score < 60000) sysout( “ gold”
)
else
sysout(“platinum” );
*/
public class Q14 {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter score: ");
	        int score = scanner.nextInt();

	        String result = score < 25000 ? "bronze" :
	                        score < 40000 ? "silver" :
	                        score < 60000 ? "gold" :
	                                         "platinum";
	        System.out.println(result);
	    }
	}