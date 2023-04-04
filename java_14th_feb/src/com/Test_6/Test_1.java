
package com.Test_6;

/*Create Course class with id and name. Course also contains SubCourse object which is a
class containing subCourseId, subCourseName. Create default constructor for both and see
each object and object constructor being called one by one. First SubCourse constructor
should be called.*/

class Course {
    private int id;
    private String name;
    private SubCourse subCourse;

    public Course(int id, String name, SubCourse subCourse) {
        this.id = id;
        this.name = name;
        this.subCourse = subCourse;
        System.out.println("Course constructor called");
    }

    public Course() {
        this.id = 0;
        this.name = "Default Course";
        this.subCourse = new SubCourse();
        System.out.println("Default Course constructor called");
    }
}

class SubCourse {
    private int subCourseId;
    private String subCourseName;

    public SubCourse(int subCourseId, String subCourseName) {
        this.subCourseId = subCourseId;
        this.subCourseName = subCourseName;
        System.out.println("SubCourse constructor called");
    }

    public SubCourse() {
        this.subCourseId = 0;
        this.subCourseName = "Default SubCourse";
        System.out.println("Default SubCourse constructor called");
    }
}

public class Test_1 {

	public static void main(String[] args) {

		        SubCourse subCourse = new SubCourse(1, "Intro to Java");
		        Course course = new Course(1, "Java Programming", subCourse);
		        Course defaultCourse = new Course();
		    }
		}

