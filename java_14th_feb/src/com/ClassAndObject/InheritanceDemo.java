package com.ClassAndObject;

class Student12
{
	   String name;
	   int age;
	   String address;
	   String contactNumber;
	   
       public Student12(String name, int age, String address, String contactNumber) 
	   {
	      this.name = name;
	      this.age = age;
	      this.address = address;
	      this.contactNumber = contactNumber;
	   }
	  public void displayInfo()
	   {
	      System.out.println("Name: " + name);
	      System.out.println("Age: " + age);
	      System.out.println("Address: " + address);
	      System.out.println("Contact Number: " + contactNumber);
	   }
	}

     class RegularStudent extends Student12 
       {
	   String studentId;
	   
       public RegularStudent(String name, int age, String address, String contactNumber, String studentId) {
	      super(name, age, address, contactNumber);
	      this.studentId = studentId;
	   }
	   
       public void displayInfo()
	   {
	      super.displayInfo();
	      System.out.println("Student ID: " + studentId);
	   }
	}

class ScholarshipStudent extends Student12
	{
	   double scholarshipAmount;
	   
	   public ScholarshipStudent(String name, int age, String address, String contactNumber, double scholarshipAmount) {
	      super(name, age, address, contactNumber);
	      this.scholarshipAmount = scholarshipAmount;
	   }
	   
	   public void displayInfo() 
	   {
	      super.displayInfo();
	      System.out.println("Scholarship Amount: " + scholarshipAmount);
	   }
	}

class InternationalStudent extends Student12
	{
	   String countryOfOrigin;
	   
	   public InternationalStudent(String name, int age, String address, String contactNumber, String countryOfOrigin) {
	      super(name, age, address, contactNumber);
	      this.countryOfOrigin = countryOfOrigin;
	   }
	   
	   public void displayInfo() 
	   {
	      super.displayInfo();
	      System.out.println("Country of Origin: " + countryOfOrigin);
	   }
	}

public class InheritanceDemo 
{

	public static void main(String[] args) 
	{

	RegularStudent regularStudent = new RegularStudent("John Doe", 18, "123 Main St", "555-1234", "12345");
    ScholarshipStudent scholarshipStudent = new ScholarshipStudent("Jane Smith", 20, "456 Elm St", "555-5678", 5000.00);
    InternationalStudent internationalStudent = new InternationalStudent("Ahmed Ali", 22, "789 Oak St", "555-9012", "Egypt");
			      
    regularStudent.displayInfo();
    System.out.println();
    scholarshipStudent.displayInfo();
    System.out.println();
    internationalStudent.displayInfo();
			   }
			}


