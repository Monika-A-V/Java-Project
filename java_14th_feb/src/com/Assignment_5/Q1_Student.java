package com.Assignment_5;

/*. WAP to have Student class has roll, name and Department object should 
have id and name. Assign and print individual values in main method
(Note - Containment using constructor and getter/setter).*/

class Student {
    private int roll;
    private String name;
    private Department department;

    public Student(int roll, String name, int departmentId, String departmentName) {
        this.roll = roll;
        this.name = name;
        this.department = new Department(departmentId, departmentName);
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
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
}
public class Q1_Student {

	public static void main(String[] args) {
	    Student student = new Student(1, "monika", 163, "Computer Science");
	    System.out.println("Roll: " + student.getRoll());
	    System.out.println("Name: " + student.getName());
	    System.out.println("Department ID: " + student.getDepartment().getId());
	    System.out.println("Department Name: " + student.getDepartment().getName());
	}
}
