package June_22.OnlineBook;

public class Book {
    private  int numOfPages;
    private String author;
    private String name;

    public Book(int numOfPages, String author, String name) {
        this.numOfPages = numOfPages;
        this.author = author;
        this.name = name;
    }


    public void bookInfo()
    {
        System.out.println(name);
        System.out.println(author);
        System.out.println(numOfPages);
    }
    public void test(){

    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numOfPages=" + numOfPages +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
