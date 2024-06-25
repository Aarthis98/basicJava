package June_22.Abstraction;

public class VideoPlayer extends MediaDevice{

    private String videoTitle;
    private int duration;

    public VideoPlayer(String name, String videoTitle, int duration) {
        super(name);
        this.videoTitle = videoTitle;
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Player Name : " + getName() + "\nVideo Title : " + getVideoTitle() + "\nDuration : " + getDuration() + "\n");
    }
    public  void playVideo(){
        System.out.println("Playing Video" );
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
