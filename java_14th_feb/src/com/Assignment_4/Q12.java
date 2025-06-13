package com.Assignment_4;

/*Create a class 'Student' with three data members which are name, age and 
address. It has two methods with the same name set_Info(). First method 
has two parameters for name and age and assigns the same whereas the 
second method takes has three parameters which are assigned to name, 
age and address respectively. Print the name, age and address.
*/
class Student 
{
	String name;
	String add;
	int age;
	public void set_info(String n,int a)
	{
		System.out.println("Name :"+n+" "+"Age :"+a );
	}
	public void set_info(String n,String add,int a)
	{
		System.out.println("Name :"+n+" "+"Address :"+add+" "+"Age :"+a);
	}}
public class Q12 {

	public static void main(String[] args) {

		Student s= new Student();
		s.set_info("pooja", 25);
	    s.set_info("Monika", "pune", 25);

	}

}
