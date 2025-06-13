package Final_Test_Paper_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//⦁Teacher[] is already present. WAP to create another Teacher[] for only
//those Teachers whose noOfStudents > 10. Also convert the newly created Teacher[] to Set 
//class Teacher {
//int id; String name; long noOfStudents;}

class Teacher {
    int id;
    String name;
    long noOfStudents;

    public Teacher(int id, String name, long noOfStudents) {
        this.id = id;
        this.name = name;
        this.noOfStudents = noOfStudents;
    }
}

public class Q5 {

	public static void main(String[] args) 
	{
		 Teacher[] teachers = new Teacher[5];
	        teachers[0] = new Teacher(1, "John", 5);
	        teachers[1] = new Teacher(2, "Jane", 15);
	        teachers[2] = new Teacher(3, "Tom", 8);
	        teachers[3] = new Teacher(4, "Mary", 20);
	        teachers[4] = new Teacher(5, "Mike", 12);

	        List<Teacher> filteredTeachers = new ArrayList<>();
	        for (Teacher teacher : teachers) 
	        {
	            if (teacher.noOfStudents > 10)
	            {
	                filteredTeachers.add(teacher);
	            }
	        }

	        Set<Teacher> teacherSet = new HashSet<>(filteredTeachers);

	        for (Teacher teacher : teacherSet) {
	            System.out.println("ID: " + teacher.id + ", Name: " + teacher.name + ", Number of Students: " + teacher.noOfStudents);
	        }
	    }
}