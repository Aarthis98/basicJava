package June_22.OnlineBook;

public class Ebook extends AudioBook {
    public Ebook(int numOfPages, String author, String name, int bookcount) {
        super(numOfPages, author, name, bookcount);
    }

    @Override
    public void displayBook() {
        super.displayBook();
    }

    @Override
    public String toString() {
        return "Ebook{}";
    }
}
