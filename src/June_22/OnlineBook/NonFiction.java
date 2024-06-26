package June_22.OnlineBook;


public class NonFiction extends Novel {
    public NonFiction(int numOfPages, String author, String name) {
        super(numOfPages, author, name);
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("This is nonfiction book");
    }
}
