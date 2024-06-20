package June_18;

public class Employee {

    int id;
    String name;
    double salary;
    String designation;
    Address address;

    public Employee(int id, String name, double salary, String designation, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}
