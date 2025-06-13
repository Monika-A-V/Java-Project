package com.Java8Features;

import java.util.ArrayList;

class Student {
	int id;
	String name;
	float marks;

	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}

public class ConsumerCollectionCustom {

	public static void main(String[] args) {

		ArrayList<Student> sal= new ArrayList<>();
		sal.add(new Student(101,"Shuruti",78.5f));
		sal.add(new Student(102,"Priyanka",88.5f));
		sal.add(new Student(103,"Pankaj",79.5f));
		sal.add(new Student(104,"Monika",89.5f));
		sal.add(new Student(105,"Anuja",80.5f));
		

       //Consumer<Student> cs= obj->System.out.println(obj.getName()+"  "+obj.getMarks());
		
       //sal.forEach(cs);
		
		sal.forEach(obj->System.out.println(obj.getName()+"  "+obj.getMarks()));
		
	}

}
