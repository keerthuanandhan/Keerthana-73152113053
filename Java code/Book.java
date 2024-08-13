import java.util.HashMap;
import java.util.Map;
public class Book {
    
    private String title;
    private String author;
    private String ISBN;
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}


public class Library {
    
    private Map<String, Book> books;

    // Constructor
    public Library() {
        books = new HashMap<>();
    }
    public void addBook(Book book) {
        if (books.containsKey(book.getISBN())) {
            System.out.println("Book with ISBN " + book.getISBN() + " already exists.");
        } else {
            books.put(book.getISBN(), book);
            System.out.println("Book added: " + book.getTitle());
        }
    }
    public void removeBook(String ISBN) {
        if (books.containsKey(ISBN)) {
            books.remove(ISBN);
            System.out.println("Book with ISBN " + ISBN + " removed.");
        } else {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books.values()) {
                book.displayBookDetails();
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("Books in the library:");
        library.displayBooks();
        library.removeBook("9780451524935");
        System.out.println("Books in the library after removal:");
        library.displayBooks();
    }
}

