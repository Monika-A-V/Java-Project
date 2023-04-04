package com.Assignment_6;

/*What is output of following code?
interface X
{
 void methodX();
}
class Y implements X
{
 void methodX()
 {
 System.out.println("Method X");
 }
}
*/
interface X
{
 void methodX();
}
class Y implements X
{
 public void methodX()
 {
 System.out.println("Method X");
 }
}
public class Q7 {

	public static void main(String[] args) {

		Y y=new Y();
		y.methodX();
	}

}
