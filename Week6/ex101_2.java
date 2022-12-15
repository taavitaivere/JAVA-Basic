package Week6;

public class ex101_2 {
    public static void main(String[] args) {
        Book cheese = new Book("The Lord of the Rings", "Allen & Unwin", 1954);
        Library.addBook(cheese);

        Book cheese2 = new Book("The Lord of the Rings", "Allen & Unwin", 1954);

        Library.addBook(new Book("The Lord of the Rings", "Allen & Unwin", 1954));

        Library.printBooks();
    }

}
