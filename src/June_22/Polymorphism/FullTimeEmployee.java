package June_22.Polymorphism;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(int empId, String name, double monthlySalary) {
        super(empId, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public  void calculatepay() {
        super.calculatepay();
        System.out.println("Full Time Employee");
        double annualSalary = monthlySalary * 12;
        System.out.println(" Employee ID : " + getEmpId() + "\n Name : " + getName() + "\n Annual Salary: $" + annualSalary);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
