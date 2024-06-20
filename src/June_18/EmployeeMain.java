package June_18;

public class EmployeeMain {
    public static void main(String[] args) {

        Address address = new Address("200 Eglinton Ave","Toronto","ON","CA","M1K 2F5");
        //use this above address in address of emp
        Employee emp1 = new Employee(101, "Aarthi",100000.00,"FSA",address);
        Employee emp2 = new Employee(101, "Gowtham",200000.00,"Senior Dev",new Address("200 Victoria Park","Toronto","ON","CA","M1K 2H5"));
        Employee emp3 = new Employee(101, "Madhu",300000.00,"FSA",new Address("200 Morning Street","Toronto","ON","CA","M1K 2F5"));
        Employee emp4 = new Employee(101, "Siva",400000.00,"QA",new Address("200 Mccowan","Toronto","ON","CA","M1K 2F5"));


        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
    }
}
