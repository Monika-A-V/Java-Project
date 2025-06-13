package com.Assignment_5;
/*Below code is showing compile time error. Can you suggest the 
corrections?
class X
{
 public X(int i)
 {
 System.out.println(1);
 }
}
class Y extends X
{
 public Y()
 {
 System.out.println(2);
 }
}
*/

class X {
	  public X(int i) {
	    System.out.println(1);
	  }
	}

class Y extends X {
	  public Y() {
	   super(0);
	   System.out.println(2);
	  }
	}
public class Q7 {

	public static void main(String[] args) {

		X y=new Y();
		
		}
}