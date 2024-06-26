package June_22.OnlineBook;

public class Novel extends Book {

   // private int type;

    public Novel(int numOfPages, String author, String name) {
        super(numOfPages, author, name);

    }
        public void displayBook(){
        System.out.println("This is a Novel Book");
    }

}
