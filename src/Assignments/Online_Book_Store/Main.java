package Assignments.Online_Book_Store;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BookStore store = new BookStore("The Java Book Store");

            store.addBook(new Book("Effective Java", "Joshua Bloch", 45.00, 10));
            store.addBook(new Book("Java: The Complete Reference", "Herbert Schildt", 55.00, 5));
            store.addBook(new Book("C++: The Complete Reference", "Herbert Schildt", 25.00, 15));
            store.addBook(new Book("Python: The Complete Reference", "Martin C. Brown", 55.00, 25));
            store.addBook(new Book("GIT Book: The Complete Reference", "Scott Chacon and Ben Straub", 55.00, 20));

            boolean exit = false;
            System.out.println("\n Purchase the book :");
            while (!exit) {
                System.out.println("\n1. List Books\n2. Purchase Book\n3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        store.listBooks();
                        break;
                    case 2:
                        System.out.println("Enter book title:");
                        String title = scanner.nextLine();
                        System.out.println("Enter quantity:");
                        int quantity = scanner.nextInt();
                        System.out.println("Are you a member? (true/false):");
                        boolean isMember = scanner.nextBoolean();
                        if(isMember){
                            store.purchaseBook(title, quantity, isMember);
                        }else{
                            System.out.println("Members can only purchase a book with offers");
                            System.out.println("Do you want to purchase without membership ?(yes/no)");
                            String membership = scanner.next();

                            if(membership.equals("no")|| membership.equals("No") || membership.equals("NO") ){
                                System.out.println("Purchase from the website and come back...");
                            }
                            else{
                                store.purchaseBook(title, quantity, isMember);
                            }
                        }

                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
            scanner.close();
        }
    }


