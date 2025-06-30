import java.util.*;

class Book {
    private int bookID;
    private String title;
    private String author;

    
    public Book(int bookID, String title, String author) 
    {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }
    public int getBookID() {
        return bookID;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    
    public void displayBook() 
    {
        System.out.println("BookID: " + bookID + ", Title: " + title + ", Author: " + author);
    }
}

public class BookManagement 
{
    public static void main(String[] args) 
    {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(101, "Java Programming", "James Gosling"));
        bookList.add(new Book(102, "Python Basics", "Guido van Rossum"));
        bookList.add(new Book(103, "C++", "Bjarne Stroustrup"));
        bookList.add(new Book(104, "Web Development", "Jon Duckett"));

        System.out.println("All Books:");
        for (Book book : bookList) 
        {
            book.displayBook();
        }

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter BookID to remove: ");
        int removeID = sc.nextInt();

        Iterator<Book> iterator = bookList.iterator();
        boolean found = false;

        while (iterator.hasNext()) 
        {
            Book book = iterator.next();
            if (book.getBookID() == removeID) 
            {
                iterator.remove();
                System.out.println("Book with ID " + removeID + " removed.");
                found = true;
                break;
            }
        }
        
        if (!found) 
        {
            System.out.println("Book with ID " + removeID + " not found.");
        }

        
        System.out.println("Updated Book List:");
        for (Book book : bookList) 
        {
            book.displayBook();
        }

        sc.close();
    }
}
