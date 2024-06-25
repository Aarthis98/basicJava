package June_22;

public class Audio extends AudioBook{
    private String story;

    public Audio(int numOfPages, String author, String name, int bookcount, String story) {
        super(numOfPages, author, name, bookcount);
        this.story = story;
    }
public void displayBook(){
    System.out.println("This is a Audio Book");
}

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "story='" + story + '\'' +
                '}';
    }
}
