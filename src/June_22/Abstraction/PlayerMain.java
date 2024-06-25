package June_22.Abstraction;

import java.util.Scanner;

public class PlayerMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get the type of Media Device");
        System.out.println("Audio Player Press 1");
        System.out.println("Video Player Press 2");
        System.out.println("Image Player Press 3");
        int choice = sc.nextInt();

        switch(choice){

            case 1 :
                AudioPlayer audioPlayer = new AudioPlayer("Audio Player","Vaa Vaathi","GV");
                audioPlayer.playAudio();
                audioPlayer.displayDetails();
                break;

            case 2:
                VideoPlayer videoPlayer = new VideoPlayer("Video Player","Series 2 Episode 4",50);
                videoPlayer.playVideo();
                videoPlayer.displayDetails();
                break;

            case 3:
                ImageDetails imageDetails = new ImageDetails("Image Display","laptop.jpg","4k");
                imageDetails.displayImage();
                imageDetails.displayDetails();
                break;

            default:
                System.out.println("Invalid Details");
        }


    }
}
