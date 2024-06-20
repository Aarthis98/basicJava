package Assignment3;

import java.util.Scanner;

class bookStore{
    String title, author;
    double price;
    int quantity;
    double totalPrice;

    public void BookStore(String title,String author,double price,int quantity){
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;

    }
    public void printDetails(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        // System.out.println();

    }
    public void totalCost() {
        // double totalCost = quantity * price;
        System.out.println("Total Cost : " + (quantity * price));
        System.out.println();
    }
}


public class BookStoreOnline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print number of books");
        int book = sc.nextInt();

        for (int i = 0; i < book; i++) {
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
        bookStore bookstore = new bookStore();
        for (int x = 0; x < book; x++) {
            bookstore.BookStore(bookstore.title, bookstore.author, bookstore.price, bookstore.quantity);
            bookstore.printDetails();
            bookstore.totalCost();
        }
    }

}
