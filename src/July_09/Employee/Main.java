package July_09.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();

        employee.add(new Employee(1,"Aarthi","Siva","abc@gmail.com","Toronto",25));
        employee.add(new Employee(2,"Gowtham","Ranganathan","xyz@gmail.com","Toronto",30));
        employee.add(new Employee(3,"Madhu","KR","abc@gmail.com","Toronto",28));
        employee.add(new Employee(4,"Achu","Kumar","abc@gmail.com","New York",35));

        for (int i=0; i < employee.size();i++){
            System.out.println(employee.get(i));
        }

        String filterCity = "New York";
        System.out.println("\nFiltered by city");
        for(Employee emp :employee){
            if(emp.getCity().equals(filterCity)){
                System.out.println(emp.getId() + " " + emp.getFirstName()+" " + emp.getLastName()+" " + emp.getEmail() +" "+emp.getCity()+ " "+emp.getAge());
            }
        }


        System.out.println("\nAge lesser than 30");
        for(Employee emp :employee){
            if(emp.getAge()<30){
                System.out.println(emp.getId() + " " + emp.getFirstName()+" " + emp.getLastName()+" " + emp.getEmail() +" "+emp.getCity()+ " "+emp.getAge());
            }
        }


    }
}
