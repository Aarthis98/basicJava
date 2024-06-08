package June_04;

public class EmployeeStatic {

    //instance variable
    int id;
    String name;

    //static variable
    static String company = "Pragra";

    //constructor
    // int id,String name are the local variable
    public EmployeeStatic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDetails(){
        System.out.println();
        System.out.println(id);
        System.out.println(name);
        System.out.println(company);

    }

    //main function
    public static void main(String[] args) {

        EmployeeStatic employee = new EmployeeStatic(101, "Pankaj");
        EmployeeStatic employee1 = new EmployeeStatic(104, "Vivek");
        EmployeeStatic employee2 = new EmployeeStatic(103, "Gowtham");

        employee.printDetails();
        employee1.printDetails();
        employee2.printDetails();


    }
}
