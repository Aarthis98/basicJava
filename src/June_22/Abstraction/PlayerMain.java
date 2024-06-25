package June_22.Abstraction;

public class PlayerMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer("Audio Player","Vaa Vaathi","GV");
        VideoPlayer videoPlayer = new VideoPlayer("Video Player","Series 2 Episode 4",50);
        ImageDetails imageDetails = new ImageDetails("Image Display","laptop.jpg","4k");

        audioPlayer.playAudio();
        audioPlayer.displayDetails();
        videoPlayer.playVideo();
        videoPlayer.displayDetails();
        imageDetails.displayImage();
        imageDetails.displayDetails();
    }
}
