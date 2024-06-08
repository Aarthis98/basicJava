package Assignment3;

public class BookStore {

    //instance variable
    String title, author;
    double price;
    double quantity;
    double totalPrice;

    public BookStore() {
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
    public void totalCost(double price, double quantity) {
        double totalCost = quantity * price;
        System.out.println("Total Cost : " + totalCost);
        System.out.println();
    }
    public void cart(){

    }



}
