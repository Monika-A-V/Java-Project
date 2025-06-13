package com.ArrayDemo;

class Course 
{
    private int courseId;
    private String courseName;
    private double fees;
    private Student student;

    public Course(int courseId, String courseName, double fees, Student student)
    {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fees = fees;
        this.student = student;
    }

    public int getCourseId() 
    {
        return courseId;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public double getFees()
    {
        return fees;
    }

    public Student getStudent() 
    {
        return student;
    }
}

class Student
{
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() 
    {
        return studentId;
    }

    public String getStudentName() 
    {
        return studentName;
    }
}

public class ArrayOfCourse
{

	    public static void main(String[] args) 
	    {
	        Student student1 = new Student(101, "Monika");
	        Student student2 = new Student(102, "Pooja");

	        Course[] courses = new Course[2];
	        courses[0] = new Course(1, "Java Programming", 1000, student1);
	        courses[1] = new Course(2, "Web Development", 1500, student2);
	        
	        for (Course course : courses)
	        {
	            System.out.println("Course ID: " + course.getCourseId());
	            System.out.println("Course Name: " + course.getCourseName());
	            System.out.println("Fees: " + course.getFees());
	            System.out.println("Student ID: " + course.getStudent().getStudentId());
	            System.out.println("Student Name: " + course.getStudent().getStudentName());
	            System.out.println();
	    }
	}
}