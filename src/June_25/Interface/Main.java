package June_25.Interface;

public class Main {
    public static void main(String[] args) {
        Pixel phone = new Pixel();

        phone.takepictures();
        phone.cameraClarity();
        phone.add();
        phone.minus();
        phone.multiply();
        phone.divide();
        phone.play();
        phone.skip();
        phone.forward();
        phone.backward();
        phone.playgames();
        phone.messages();

        GooglePlayStore googlePlayStore = new GooglePlayStore();
        googlePlayStore.apps();

    }
}
