package com.JavaDemo;

class Invalidsumexception extends Exception
{
	Invalidsumexception(String string)
	{
		super();
	}
}

public class Demo
{
	public void valid() throws Invalidsumexception
	{
	String s="monika1235";
	int sum=0;

	
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c>='0' && c<='9')
		{
			int digit=Character.getNumericValue(c);
			sum=sum+digit;
		}}
	    System.out.println(sum);
	
			if(sum<10)
			{
				throw new Invalidsumexception("invalid sum");
			}
			else
			{
				System.out.println("valid sum");
			}
	}
public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			d.valid();
		}
		catch(Invalidsumexception i)
		{
			System.out.println(i);
		}
	
	
}}
/*import java.util.Scanner;

class Employee 
{
    int id;
    String name;
    String department;
    static Employee e[]=new Employee[10];
    static int employeeCount=0;

 
    public Employee(int id, String name, String department) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
       
       }
    public static void createEmployee(int id, String name, String department) 
    {
    	Employee emp = new Employee(id, name, department);
        e[employeeCount] = emp;
        employeeCount++;
    }
    public static Employee readEmployee(int id) 
    {
        for (int i = 0; i < employeeCount; i++)
        {
            if (e[i].id == id) 
            {
                return e[i];
            }
        }
        return null;
    }
    public static void updateEmployee(int id, String name, String department)
    {
        for (int i = 0; i < employeeCount; i++) 
        {
            if (e[i].id == id) 
            {
                e[i].name = name;
                e[i].department = department;
            }
        }
    }
    public static void deleteEmployee(int id) 
    {
        for (int i = 0; i < employeeCount; i++) 
        {
            if (e[i].id == id) 
            {
                for (int j = i; j < employeeCount - 1; j++)
                {
                    e[j] = e[j + 1];
                }
                e[employeeCount - 1] = null;
                employeeCount--;
                System.out.println("Employee deleted successfully");
                return;
            }
        }
        System.out.println("Employee not found");
    }
     }
public class EMPLOYEE_CRUD {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Create employee");
	            System.out.println("2. Read employee");
	            System.out.println("3. Update employee");
	            System.out.println("4. Delete employee");
	            System.out.println("5. exit");

	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();

	            switch (choice)
	            {
	                case 1:
	                    System.out.print("Enter employee id: ");
	                    int id = sc.nextInt();
	                    System.out.print("Enter employee name: ");
	                    String name = sc.next();
	                    System.out.print("Enter employee department: ");
	                    String department = sc.next();
	                    Employee.createEmployee(id, name, department);
	                    System.out.println("Employee created successfully");
	                    break;
	                case 2:
	                    System.out.print("Enter employee id: ");
	                    id = sc.nextInt();
	                    Employee employee = Employee.readEmployee(id);
	                    if (employee != null) 
	                    {
	                        System.out.println("Employee details:");
	                        System.out.println("ID: " + employee.id);
	                        System.out.println("Name: " + employee.name);
	                        System.out.println("Department: " + employee.department);
	                    } 
	                    else 
	                    {
	                        System.out.println("Employee not found");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter employee id: ");
	                    id = sc.nextInt();
	                    System.out.print("Enter employee name: ");
	                    name = sc.next();
	                    System.out.print("Enter employee department: ");
	                    department = sc.next();
	                    Employee.updateEmployee(id, name, department);
	                    System.out.println("Employee updated successfully");
	                    break;
	                case 4:
	                    System.out.print("Enter employee id: ");
	                    id = sc.nextInt();
	                    Employee.deleteEmployee(id);
	                    break;
	                case 5:
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	                    break;
	            }
	        }
	    }
	
}	
	
		/*Employee emp1 = new Employee(1,"Monika","comp");

	    emp1.InsertEmployee(1, "anvi", "sales");
     emp1.InsertEmployee(2, "pooja", "HR");
	    emp1.InsertEmployee(3, "priti", "IT");
	    
	    System.out.println("List of Employees:");
	    for (int i = 0; i < emp1.employeeCount; i++) 
	    {
	        System.out.println("ID: " + emp1.e[i].id);
	        System.out.println("Name: " + emp1.e[i].name);
	        System.out.println("Department: " + emp1.e[i].department);
	        System.out.println("------------------------");
	    }
	        Employee p=emp1.readEmployee(1);
	        System.out.println(p.id+" "+p.name+" "+p.department);
	        
	        emp1.updateEmployee(3, "sanju", "Finance");
	        //p = emp1.readEmployee(1);
	        System.out.println(emp1.id + " " + emp1.name + " " + emp1.department);
	    }
	}*/





/*package COM_PROJ;
import java.util.Scanner;


class Book 
{
	private int bId;
	private String bName;
	private String AuthorName;
	private int price;
	
	public Book(int bId, String bName, String authorName, int price) {
		super();
		this.bId = bId;
		this.bName = bName;
		AuthorName = authorName;
		this.price = price;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", AuthorName=" + AuthorName + ", price=" + price + "]";
	}}
public class BOOOK_CRUD {

	public static void main(String[] args) {

        Book b[]=new Book[10];
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		int flag=0;
		
		while(true)
		{
			System.out.println("1.Add Book");
			System.out.println("2.Update Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Search");
			System.out.println("5 View");
			System.out.println("6 Exit");
			
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			int bookid,price;
			String bname,authorname;
			
			int b_id;
			
			switch(choice)
			{
			case 1:
				System.out.println("Add Book");
				System.out.println("Enter number of books");
				int a=sc.nextInt();
				for(int i=0;i<a;i++)
				{
					System.out.println("Enter book id");
					bookid=sc.nextInt();
					System.out.println("Enter book name");
					bname=sc.next();
					System.out.println("Enter author name");
					authorname=sc.next();
					System.out.println("Enter price");
					price=sc.nextInt();
					b[count]=new Book(bookid,bname,authorname,price);
					count++;
					
				}
				System.out.println("Add book succesfully");
				break;
				
				case 2:
					System.out.println("Update Book");
					System.out.println("Enetr book id you want to update");
					b_id=sc.nextInt();
					for(int i=0;i<count;i++)
					{
						if(  b[i].getbId()==b_id)
						{
							flag=1;
							System.out.println("Enter the price you want to update");
							 price=sc.nextInt();
							 b[i].setPrice(price);
						}
					}
					if(flag==0)
					{
						System.out.println("book is not present");
					}
					break;
					
				case 3:	
					System.out.println("Delete Book");
					System.out.println("Enetr book id you want to update");
					 b_id=sc.nextInt();
					 for(int i=0;i<count;i++)
						{
							if(b[i].getbId()==b_id)
							{
								flag=1;
								b[i]=null;
								System.out.println("book delete sucessfully");
							}
			               }
					 
					if(flag==0)
						{
							System.out.println("book is not present");
						}
					 break;
				case 4:
				    System.out.println("Search Book");
				    System.out.println("Enter book id you want to search");
				    b_id=sc.nextInt();
				    flag=0;
				    for(int i=0;i<count;i++)
				    {
				        if(b[i]!=null && b[i].getbId()==b_id)
				        {
				            flag=1;
				            System.out.println("Book details:");
				            System.out.println(b[i]);
				            break;
				        }
				    }
				    if(flag==0)
				    {
				        System.out.println("Book not found");
				    }
				    break;					 
				case 5:
					System.out.println("show books");
					System.out.println(count);
					for(int i=0;i<count;i++)
					{
						if(b[i]!=null)
						{
						System.out.println(b[i]);
						}
					}
					break;
				case 6:
					System.exit(0);
					break;
			}}}
*/


/*COLLECTION-BOOK
package COM_PROJ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class Book1
{
    int bId;
    String bName;
    String authorName;
    int price;

    public Book1(int bId, String bName, String authorName, int price) 
    {
        this.bId = bId;
        this.bName = bName;
        this.authorName = authorName;
        this.price = price;
    }

    @Override
    public String toString() 
    {
    	return bId+" "+bName+" "+authorName+" "+price;
    }
}
public class BOOOK_COLLECTION 
{

	public static void main(String[] args) 
	{
		    ArrayList<Book1> bookList = new ArrayList<Book1>();

		    Scanner sc = new Scanner(System.in);
		    int flag = 0;

		    while (true) 
		    {
		        System.out.println("1.Add Book");
		        System.out.println("2.Update Book");
		        System.out.println("3.Delete Book");
		        System.out.println("4.Search");
		        System.out.println("5.View");
		        System.out.println("6.Exit");

		        System.out.println("Enter choice");
		        int choice = sc.nextInt();

		        switch (choice) 
		        {
		            case 1:
		                System.out.println("Add Book");
		                System.out.println("Enter number of books");
		                int a = sc.nextInt();
		                for (int i = 0; i < a; i++)
		                {
		                    System.out.println("Enter book id");
		                    int bookid = sc.nextInt();
		                    System.out.println("Enter book name");
		                    String bname = sc.next();
		                    System.out.println("Enter author name");
		                    String authorname = sc.next();
		                    System.out.println("Enter price");
		                    int price = sc.nextInt();
		                    bookList.add(new Book1(bookid, bname, authorname, price));
		                }
		                System.out.println("Add book successfully");
		                break;

		            case 2:
		                System.out.println("Update Book");
		                System.out.println("Enter book id you want to update");
		                int b_id = sc.nextInt();
		                flag = 0;
		                for (Book1 b : bookList) 
		                {
		                    if (b.bId == b_id) 
		                    {
		                        flag = 1;
		                        System.out.println("Enter the price you want to update");
		                        int price = sc.nextInt();
		                        b.price = price;
		                        System.out.println("Book updated successfully");
		                    }
		                }
		                if (flag == 0)
		                {
		                    System.out.println("Book not found");
		                }
		                break;

		            case 3:
		                System.out.println("Delete Book");
		                System.out.println("Enter book id you want to delete");
		                b_id = sc.nextInt();
		                flag = 0;
		                Iterator<Book1> iterDelete = bookList.iterator();
		                while (iterDelete.hasNext()) 
		                {
		                    Book1 b = iterDelete.next();
		                    if (b.bId == b_id)
		                    {
		                        flag = 1;
		                        iterDelete.remove();
		                        System.out.println("Book deleted successfully");
		                    }
		                }
		                if (flag == 0) 
		                {
		                    System.out.println("Book not found");
		                }
		                break;

		            case 4:
		            System.out.println("Search Book");
		            System.out.println("Enter book name or author name you want to search");
		            String search_str = sc.next();
		            flag = 0;
		            for (Book1 b : bookList) 
		            {
		                if (b.bName.equalsIgnoreCase(search_str) || b.authorName.equalsIgnoreCase(search_str)) {
		                    flag = 1;
		                    System.out.println("book is found : ");
		                }
		            }
		            if (flag == 0) 
		            {
		                System.out.println("Book not found");
		            }
		            break;

		                case 5:
		                    System.out.println("View Books");
		                    if (bookList.isEmpty()) 
		                    {
		                        System.out.println("No books to display");
		                    } 
		                    else 
		                    {
		                        for (Book1 b : bookList)
		                        {
		        	      System.out.println(b.bId +" " + b.bName +" "+b.authorName+" "+b.price);

		                        }
		                        }
		                    
		                    break;
		    
                       case 6:
                           System.out.println("Exiting...");
                           System.exit(0);
                           break;
                
		               case 7:
                           default:
                           System.out.println("Invalid choice");
                break;
        }
		                    }
}}
*/
