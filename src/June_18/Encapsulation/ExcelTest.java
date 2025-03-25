package June_18.Encapsulation;

public class ExcelTest {
    private String  name;

    public ExcelTest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExcelTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
