package ArrayDemo;


class Student11 
{
    int id;
    String name;
    int[] marks;
    
    public Student11(int id, String name, int[] marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    public double getPercentage() 
    {
        int total = 0;
        for (int mark : marks) 
        {
            total += mark;
        }
        return (double) total / marks.length;
    }
}

public class ArrayOfStudent 
{
	public static void main(String[] args) 
	{
        Student11[] students = new Student11[3];
            students[0]=new Student11(1, "Monika", new int[]{70, 80, 90});
            students[1]=new Student11(2, "Pooja", new int[]{90, 90, 30});
            students[2]=new Student11(3, "Sanju", new int[]{50, 90, 40});
            
        
        for (Student11 student : students)
        {
            double percentage = student.getPercentage();
            if (percentage >= 60.0)
            {
                System.out.printf("\nStudent id is :" +student.id+"\nstudent name is: " +student.name+"\nstudent percentage is : " +percentage);
            }
        }
    }


}
