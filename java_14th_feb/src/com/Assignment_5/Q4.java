package com.Assignment_5;

/*Create a class with display() method that prints "This is parent class" and its 
subclass with another view() method that prints "This is child class". Now, 
create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class*/


class Parent {
 public void display() {
     System.out.println("This is parent class");
 }
}
class Child extends Parent {
 public void view() {
     System.out.println("This is child class");
 }
}
public class Q4 {

	public static void main(String[] args) {
		
		Parent parentObj = new Parent();
        parentObj.display();

        Child childObj = new Child();
        childObj.view();

        childObj.display();
    }
}
