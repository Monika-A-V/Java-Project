package CRUD_OPERATION_PROJECT;

import java.util.Scanner;

class Book 
{
	private int bId;
	private String bName;
	private String AuthorName;
	private int price;
	
	public Book(int bId, String bName, String authorName, int price) 
	{
		super();
		this.bId = bId;
		this.bName = bName;
		AuthorName = authorName;
		this.price = price;
	}

	public int getbId()
	{
		return bId;
	}

	public void setbId(int bId) 
	{
		this.bId = bId;
	}

	public String getbName()
	{
		return bName;
	}

	public void setbName(String bName) 
	{
		this.bName = bName;
	}

	public String getAuthorName() 
	{
		return AuthorName;
	}

	public void setAuthorName(String authorName)
	{
		AuthorName = authorName;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Book [bId=" + bId + ", bName=" + bName + ", AuthorName=" + AuthorName + ", price=" + price + "]";
	}}
public class BOOK_CRUD_ARRAY 
{
	public static void main(String[] args)
	{
	
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
		}