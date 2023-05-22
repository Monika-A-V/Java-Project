package Final_Test_Paper_1;

/*⦁	WAP which contains throw throws finally, 2 times catch, custom Exception,
  inheritance containing throws some exception */

class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
}

class ParentClass 
{
    public void someMethod() throws CustomException 
    {
        try {
            throw new CustomException("Custom exception occurred in ParentClass");
        }
        catch (CustomException e) 
        {
            System.out.println("ParentClass caught CustomException: " + e.getMessage());
            throw e;
        } 
        finally 
        {
            System.out.println("ParentClass finally block executed");
        }
    }
}

class ChildClass extends ParentClass
{
    public void someMethod() throws CustomException
    {
        try
        {
            throw new CustomException("Custom exception occurred in ChildClass");
        }
        catch (CustomException e)
        {
            System.out.println("ChildClass caught CustomException: " + e.getMessage());
            throw e;
        }
        finally 
        {
            System.out.println("ChildClass finally block executed");
        }
    }
}
public class Q8
{
	public static void main(String[] args) 
	{
		ChildClass child = new ChildClass();
        try 
        {
            child.someMethod();
        } 
        catch (CustomException e) 
        {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}