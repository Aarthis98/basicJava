package June_22.Abstraction;

public class ImageDetails extends MediaDevice{

    private String imageName;
    private String resolution;

    public ImageDetails(String name, String imageName, String resolution) {
        super(name);
        this.imageName = imageName;
        this.resolution = resolution;
    }

    @Override
    public void displayDetails() {
        System.out.println("Player Name : " + getName() + "\nImage Name : " + getImageName() + "\nResolution : " + getResolution() + "\n");
    }

    public void displayImage(){
        System.out.println("Image Displayed");
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
