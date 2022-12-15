package Week6;

import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public static void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public static void printBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

    public static ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.books) {
            if (StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }

    public static ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.books) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }
}
