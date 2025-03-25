package June_22.OnlineBook;


public class BookMain {
    public static void main(String[] args) {

        AudioBook audiobook = new AudioBook(101, "Chetan","point someone",250);
        Ebook ebook = new Ebook(101, "Chetan","point someone",250);
        Fiction fiction = new Fiction(101, "Chetan","point someone");
        NonFiction nonFiction = new NonFiction(101, "Chetan","point someone");

        fiction.bookInfo();
        fiction.setStory("Horor");
        audiobook.bookInfo();
        ebook.displayBook();
        nonFiction.displayBook();
    }
}
