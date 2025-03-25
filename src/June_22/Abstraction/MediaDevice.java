package June_22.Abstraction;

public abstract class MediaDevice {
    private String name;

    public MediaDevice(String name) {
        this.name = name;
    }
    public abstract void displayDetails();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
