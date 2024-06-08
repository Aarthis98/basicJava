package Assignment3;

import java.util.Scanner;

public class BookStoreMain {

    public static void main(String[] args) {
/*
        BookStore bookstore = new BookStore("Positive Thinking","Norman Vincent Peale",200.0,5);
        BookStore bookstore1 = new BookStore("Control Your Mind","Eric Robert",300.0,3);
        BookStore bookstore2 = new BookStore("Wings of Fire","Arun Tiwari",250.0,10);
        BookStore bookstore3 = new BookStore("Pandamic","Nehru",20.0,40);
        BookStore bookstore4 = new BookStore("Minions","Cartoon",400.0,1);
        bookstore.printDetails();
        bookstore.totalCost();
        bookstore1.printDetails();
        bookstore1.totalCost();
        bookstore2.printDetails();
        bookstore2.totalCost();
        bookstore3.printDetails();
        bookstore3.totalCost();
        bookstore4.printDetails();
        bookstore4.totalCost();
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Print number of books you have to add in the Store :  ");
        int booksCount = sc.nextInt();

        int i =0;
        while(i<booksCount) {
            System.out.print("Title: ");
            String title = sc.next();
            System.out.print("Author: ");
            String author = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            System.out.println();
            i++;
        }
        BookStore bookstore = new BookStore();
        for (int x = 0; x < booksCount; x++) {
            bookstore.printDetails();
            bookstore.totalCost(bookstore.price,bookstore.quantity);
        }




    }
}
