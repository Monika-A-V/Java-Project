package CRUD_OPERATION;

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
public class BOOK_CRUD_COLLECTION 
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
}
}