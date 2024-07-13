# Online Book Store

# Introduction
It is small application used for purchase a books through online.

# Java Concepts Used
- Classes and Objects
- Exception Handling
- Interfaces
- Inheritance
- Custom Exceptions

# Classes and Methods
## Book Class
- Book(String title, String author, double price, int stock): Constructor to initialize book properties.
- String getTitle(): Returns the title of the book.
- String getAuthor(): Returns the author of the book.
- double getPrice(): Returns the price of the book.
- int getStock(): Returns the stock of the book.
- void sellBook(int quantity): Reduces the stock by the specified quantity, throws InsufficientStockException if stock is insufficient.

## InsufficientStockException Class
- InsufficientStockException(String message): Constructor that accepts a message and passes it to the superclass constructor.

## Discount Interface
- double applyDiscount(double price): Method to apply a discount to the price.

## MemberDiscount Class
- double applyDiscount(double price): Implements a 10% discount for members.

## BookStore Class
- BookStore(String name): Constructor to initialize the store name and an empty list of books.
- void addBook(Book book): Adds a book to the store.
- void listBooks(): Lists all books with their details.
- void purchaseBook(String title, int quantity, boolean isMember): Purchases a book by title and quantity. 
Applies a discount if the purchaser is a member. Handles exceptions appropriately and provides meaningful messages to the user.

## Main Class
- public static void main(String[] args): Main method to simulate the book store operations.


## Sample Input and Output
Title: Effective Java, Author: Joshua Bloch, Price: $45.0, Stock: 10
Title: Java: The Complete Reference, Author: Herbert Schildt, Price: $55.0, Stock: 5
Title: C++: The Complete Reference,Author: Herbert Schildt,Price: 25.00, Stock: 15
Title: Python: The Complete Reference,Author: Martin C. Brown,Price: 55.00, Stock: 25
Title: GIT Book: The Complete Reference,Author: Scott Chacon and Ben Straub,Price: 55.00, Stock:20

Purchase a book:
1. List Books
2. Purchase Book
3. Exit

1
Title: Effective Java, Author: Joshua Bloch, Price: $45.0, Stock: 10
Title: Java: The Complete Reference, Author: Herbert Schildt, Price: $55.0, Stock: 5
Title: C++: The Complete Reference,Author: Herbert Schildt,Price: 25.00, Stock: 15
Title: Python: The Complete Reference,Author: Martin C. Brown,Price: 55.00, Stock: 25
Title: GIT Book: The Complete Reference,Author: Scott Chacon and Ben Straub,Price: 55.00, Stock:20

1. List Books
2. Purchase Book
3. Exit

2
Enter book title:
Effective Java
Enter quantity:
2
Are you a member? (true/false):
true
Purchased 2 copies of Effective Java at $40.5 each.

1. List Books
2. Purchase Book
3. Exit
   2
   Enter book title:
   Effective Java
   Enter quantity:
   2
   Are you a member? (true/false):
   false
   Members can only purchase a book with offers
   Do you want to purchase without membership ?(yes/no)
   yes
   Purchased 2 copies of Effective Java at $45.0 each.

1. List Books
2. Purchase Book
3. Exit

2
   Enter book title:
   Effective Java
   Enter quantity:
   15
   Are you a member? (true/false):
   true
   Insufficient stock for 15 copies of Effective Java

1. List Books
2. Purchase Book
3. Exit

3