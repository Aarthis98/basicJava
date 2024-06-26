package June_22.OnlineBook;

public class OnlineBook extends Book {
    private  int length;

    public OnlineBook(int numOfPages, String author, String name, int length) {
        super(numOfPages, author, name);
        this.length = length;
    }
    public void bookInfo(){
        System.out.println("Length of the Book : " +length);
    }
}
