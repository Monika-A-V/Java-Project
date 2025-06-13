package Final_Test_Paper_1;

/*⦁	Write Tree structure of Abstract Factory pattern for College structure*/

interface CollegeFactory
{
    Department createDepartment();
    Student1 createStudent();
}

class EngineeringCollegeFactory implements CollegeFactory
{
    @Override
    public Department createDepartment()
    {
        return new EngineeringDepartment();
    }
    
    @Override
    public Student1 createStudent() 
    {
        return new EngineeringStudent();
    }
}

class ArtsCollegeFactory implements CollegeFactory
{
    @Override
    public Department createDepartment() 
    {
        return new ArtsDepartment();
    }
    
    @Override
    public Student1 createStudent() 
    {
        return new ArtsStudent();
    }
}

interface Department 
{
    void offerPrograms();
}

class EngineeringDepartment implements Department
{
    @Override
    public void offerPrograms() 
    {
        System.out.println("Engineering Department offers engineering programs.");
    }
}

class ArtsDepartment implements Department
{
    @Override
    public void offerPrograms() 
    {
        System.out.println("Arts Department offers arts programs.");
    }
}

interface Student1
{
    void enroll();
}

class EngineeringStudent implements Student1
{
    @Override
    public void enroll() 
    {
        System.out.println("Enrolling in an engineering program.");
    }
}

class ArtsStudent implements Student1
{
    @Override
    public void enroll() 
    {
        System.out.println("Enrolling in an arts program.");
    }
}

public class Q11
{

	public static void main(String[] args)
	{
        CollegeFactory engineeringCollegeFactory = new EngineeringCollegeFactory();
        Department engineeringDepartment = engineeringCollegeFactory.createDepartment();
        Student1 engineeringStudent = engineeringCollegeFactory.createStudent();
        
        engineeringDepartment.offerPrograms();
        engineeringStudent.enroll();
        
        CollegeFactory artsCollegeFactory = new ArtsCollegeFactory();
        Department artsDepartment = artsCollegeFactory.createDepartment();
        Student1 artsStudent = artsCollegeFactory.createStudent();
        
        artsDepartment.offerPrograms();
        artsStudent.enroll();
    }
}