package June_25.Interface;
public class Pixel extends GooglePlayStore implements Camera,Calculator,Games,MusicPlayer,Messages{

    @Override
    public void add() {
        System.out.println("Performs Addition..");
    }

    @Override
    public void minus() {
        System.out.println("Performs Subtraction..");

    }

    @Override
    public void multiply() {
        System.out.println("Performs Multiplication..");

    }

    @Override
    public void divide() {
        System.out.println("Performs Division..");

    }

    @Override
    public void cameraClarity() {
        System.out.println("Clarity is good..");

    }

    @Override
    public void takepictures() {
        System.out.println("Take Pictures..");

    }

    @Override
    public void playgames() {

        System.out.println("Play games..");
    }

    @Override
    public void play() {

        System.out.println("Play Music..");
    }

    @Override
    public void skip() {

        System.out.println("Skip Music..");
    }

    @Override
    public void backward() {

        System.out.println("Backward Music..");
    }

    @Override
    public void forward() {

        System.out.println("Forward Music..");
    }

    @Override
    public void messages() {
        System.out.println("Sending Messages..");
    }
}

