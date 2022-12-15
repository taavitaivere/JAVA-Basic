package Week6;

import java.util.ArrayList;

public class ex101_3 {
    public static void main(String[] args) {
        Library library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        ArrayList<Book> books = library.searchByTitle("Cheese");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book : library.searchByPublisher("Penguin Group")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book : library.searchByYear(1851)) {
            System.out.println(book);
        }
    }
}
