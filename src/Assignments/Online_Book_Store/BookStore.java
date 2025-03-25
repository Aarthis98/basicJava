package Assignments.Online_Book_Store;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private String name;
    private List<Book> books;

    public BookStore(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        System.out.println("Books available in " + name + ":");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
                    ", Price: $" + book.getPrice() + ", Stock: " + book.getStock());
        }
    }

    public void purchaseBook(String title, int quantity, boolean isMember) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                double finalPrice = book.getPrice();
                if (isMember) {
                    Discount discount = new MemberDiscount();
                    finalPrice = discount.applyDiscount(finalPrice);
                }

                try {
                    book.sellBook(quantity);
                    System.out.println("Purchased " + quantity + " copies of " + title + " at $" + finalPrice + " each.");
                } catch (InsufficientStockException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Book titled '" + title + "' not found in the store.");
    }
}
