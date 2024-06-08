package Assignment3;

import java.util.Scanner;

class bookStore{
    String title, author;
    double price;
    int quantity;
    double totalPrice;

    public void BookStore() {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;

    }
}

public class BookMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print number of books");
        int book = sc.nextInt();

        for(int i=0;i<book;i++){
            System.out.print("Title: ");
            String title = sc.next();
            System.out.print("Author: ");
            String author = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            System.out.println();
        }
        BookStore bookStore = new BookStore();

    }
}
