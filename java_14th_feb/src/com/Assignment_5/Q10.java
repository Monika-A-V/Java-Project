package com.Assignment_5;

/*Create class Student (id, name) then create 2 objects of Student using new 
keyword. Print 2 objects and see its hashcode is different E.g.
tudent@15db9742 and Student@2329742. If you do this Student s1 = new 
Student (); Student s2 = s1; Now print s1 and s2 see both reference 
variables are pointing to same location now override the toString () method 
in student class and see the beautiful output.*/

class Student13 {
    private int id;
    private String name;

    public Student13(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id+" "+name;
    }
}

public class Q10 {

	public static void main(String[] args) {

				Student13 s1 = new Student13(1, "monika");
		        //Student13 s2 = new Student13(2, "pooja");
				Student13 s2=s1;

		        System.out.println("s1: " + s1);
		        System.out.println("s2: " + s2);
		    }
}