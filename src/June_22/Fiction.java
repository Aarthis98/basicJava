package June_22;

public class Fiction extends Novel {

    private String story;


    public Fiction(int numOfPages, String author, String name) {
        super(numOfPages, author, name);
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public String toString() {
        return "Fiction{" +
                "story='" + story + '\'' +
                '}';
    }
}
