package Final_Test_Paper_1;

/*There is a HashSet which has student objects.
Create two arraylists from this hashset. In one arraylist 
called ‘placedStudents’ insert all students who have been placed 
and in another arraylist ‘unplacedStudents’ 
Student class--Fields
studid, Name, Qualification, yearOfpassing, placed(true/false)*/

import java.util.ArrayList;
import java.util.HashSet;

class Student {
    int studId;
    String name;
    String qualification;
    int yearOfPassing;
    boolean placed;

    public Student(int studId, String name, String qualification, int yearOfPassing, boolean placed) {
        this.studId = studId;
        this.name = name;
        this.qualification = qualification;
        this.yearOfPassing = yearOfPassing;
        this.placed = placed;
    }
}

public class Q2 {

	public static void main(String[] args) 
	{
		 HashSet<Student> studentsHashSet = new HashSet<>();

	        studentsHashSet.add(new Student(1, "pooja", "B.Tech", 2022, true));
	        studentsHashSet.add(new Student(2, "ram", "M.Tech", 2021, false));
	        studentsHashSet.add(new Student(3, "monika", "B.E.", 2023, true));
	        studentsHashSet.add(new Student(4, "sham", "Ph.D.", 2022, false));

	        ArrayList<Student> placedStudents = new ArrayList<>();
	        ArrayList<Student> unplacedStudents = new ArrayList<>();

	        for (Student student : studentsHashSet) {
	            if (student.placed) {
	                placedStudents.add(student);
	            } else {
	                unplacedStudents.add(student);
	            }
	        }

	        System.out.println("Placed Students:");
	        for (Student student : placedStudents) {
	            System.out.println("ID: " + student.studId + ", Name: " + student.name);
	        }

	        System.out.println("\nUnplaced Students:");
	        for (Student student : unplacedStudents) {
	            System.out.println("ID: " + student.studId + ", Name: " + student.name);
	        }
	    }
	}