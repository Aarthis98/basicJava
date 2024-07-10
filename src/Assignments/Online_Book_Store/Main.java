package Assignments.Online_Book_Store;

public class Main {

        public static void main(String[] args) {
            Book book = new Book("Java Programming", "John Doe", 29.99, 50);

            try {
                book.sellBook(10); // Sell 10 copies
                System.out.println("Successfully sold 10 copies of " + book.getTitle());
                System.out.println("Remaining stock: " + book.getStock());

                book.sellBook(50); // Try to sell 50 copies
                System.out.println("Successfully sold 50 copies of " + book.getTitle());
                System.out.println("Remaining stock: " + book.getStock());
            } catch (InsufficientStockException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


