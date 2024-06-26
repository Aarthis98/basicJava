package June_22.OnlineBook;

public class AudioBook extends Book {
    private int bookcount;

    public AudioBook(int numOfPages, String author, String name, int bookcount) {
        super(numOfPages, author, name);
        this.bookcount = bookcount;
    }

    public  void displayBook(){
     //   super.displayBook();
        System.out.println("This is a audio Book");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "bookcount=" + bookcount +
                '}';
    }
}
