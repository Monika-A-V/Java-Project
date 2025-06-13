package com.Assignment_4;

/*.Create a class to print an integer and a character with two methods having 
the same name but different sequence of the integer and the character 
parameters.For example, if the parameters of the first method are of the 
form (int n, char c), then that of the second method will be of the form 
(char c, int n).*/

class NumChar 
{
	public void print(int n ,char c)
	{
		System.out.println(n+" "+c);
	}
	public void print(char c,int n)
	{
		System.out.println(c+" "+n);
	}
}
public class Q13 {

	public static void main(String[] args) {

		NumChar obj=new NumChar();
		obj.print(5, 'A');
		obj.print('A', 5);

	}
}
