package June_22.Abstraction;

public class AudioPlayer extends MediaDevice{

    private String songName;
    private String artist;

    public AudioPlayer(String name, String songName, String artist) {
        super(name);
        this.songName = songName;
        this.artist = artist;
    }
    @Override
    public void displayDetails() {
        //System.out.println("Details About the Audio");
        System.out.println("Player Name : " + getName() + "\nSong Name : " + getSongName() + "\nArtist : " + getArtist() + "\n");

    }
    public void playAudio(){
        System.out.println("Playing Audio");
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


}
