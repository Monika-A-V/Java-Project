package com.Test_11;

import java.util.ArrayList;
import java.util.List;

/*There is list of book objects.
 * Book class { int bookid , String bookname, int authorid , int price , int copiessold } 
 *  Author class { int authorid , String authorname , int totalbookssold }  
 *  There is list of author objects Update totalbookssold of author objects. 
 *  Totalbookssold is total of all copiessold of books written by that author.
*/

class Book {
    public int bookId;
    public String bookName;
    public int authorId;
    public int price;
    public int copiesSold;
    
    public Book(int bookId, String bookName, int authorId, int price, int copiesSold) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorId = authorId;
        this.price = price;
        this.copiesSold = copiesSold;
    }
}

class Author {
    public int authorId;
    public String authorName;
    public int totalBooksSold;
    
    public Author(int authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.totalBooksSold = 0;
    }
}

public class Q3 {

	public static void main(String[] args) {

		Author author1 = new Author(1, "POOJA");
        Author author2 = new Author(2, "MONIKA");
        
        Book book1 = new Book(1, "A", 1, 10, 1000);
        Book book2 = new Book(2, "B", 1, 12, 1500);
        Book book3 = new Book(3, "C", 2, 15, 2000);
        Book book4 = new Book(4, "D", 2, 18, 2500);
        
        List<Author> authors = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        
        authors.add(author1);
        authors.add(author2);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        
        for (Author author : authors) 
        {
            for (Book book : books)
            {
                if (book.authorId == author.authorId) 
                {
                    author.totalBooksSold += book.copiesSold;
                }
            }
        }
        
        for (Author author : authors)
        {
            System.out.println(author.authorName + " - Total Books Sold: " + author.totalBooksSold);
        }
    }
}
