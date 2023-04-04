package AssignmentOnOOPS;

public class StudentPercentage 
{

	String name;
    int marks1;
    int marks2;
    int marks3;
    double percentage;

public StudentPercentage(String name, int marks1, int marks2, int marks3) 
{
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.percentage = calculatePercentage();
		    }

 double calculatePercentage()
 {
       return (marks1 + marks2 + marks3) / 3.0;
  }
public void printResult() 
{
	  System.out.println("Name: " + name);
      System.out.println("Marks 1: " + marks1);
	  System.out.println("Marks 2: " + marks2);
	  System.out.println("Marks 3: " + marks3);
	  System.out.println("Percentage: " + percentage);

	if (percentage >= 60) 
	{
         System.out.println("Result: First class");
	}
	else if (percentage >= 50) 
	{
		 System.out.println("Result: Second class");
     } 
	else 
	{
		 System.out.println("Result: Failed");
	 }
	}
public static void main(String[] args)
{

	 StudentPercentage student1 = new StudentPercentage("John", 70, 80, 90);
	 student1.printResult();

	 StudentPercentage student2 = new StudentPercentage("Jane", 50, 60, 70);
	 student2.printResult();

	 StudentPercentage student3 = new StudentPercentage("Bob", 30, 40, 50);
	 student3.printResult();
	    }
	}

