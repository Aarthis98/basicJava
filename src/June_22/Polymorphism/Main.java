package June_22.Polymorphism;

import com.sun.xml.internal.ws.wsdl.writer.document.Part;

public class Main {
    public static void main(String[] args) {


        Employee employee = new Employee(101, "Aarthi");
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Aarthi", 2000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Gowtham",23,5);



        fullTimeEmployee.calculatepay();
        partTimeEmployee.calculatepay();
    }

}
