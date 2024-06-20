package June_18.Encapsulation;

public class ExcelDemo {

   private boolean read;
   private boolean write;

    public ExcelDemo(boolean read, boolean write) {
        this.read = read;
        this.write = write;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    @Override
    public String toString() {
        return "ExcelDemo{" +
                "read=" + read +
                ", write=" + write +
                '}';
    }
}
