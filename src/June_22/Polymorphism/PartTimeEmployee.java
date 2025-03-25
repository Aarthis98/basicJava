package June_22.Polymorphism;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(int empId, String name, double hourlyRate, double hoursWorked) {
        super(empId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculatepay() {
        super.calculatepay();
        System.out.println("Part Time Employee");
        double totalPay = hourlyRate * hoursWorked;
        System.out.println(" Employee ID : " + getEmpId() + "\n Name : " + getName() + "\n Total Salary: $" + totalPay);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
