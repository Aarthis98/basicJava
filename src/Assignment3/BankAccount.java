package Assignment3;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private static int totalAccounts = 0;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public static void displayTotalAccounts() {
        System.out.println("Total number of accounts created: " + totalAccounts);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println('\n');
        System.out.println("Account Holder Name : " +accountHolderName );
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println('\n');
            System.out.println("Account Holder Name : " +accountHolderName );
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println('\n');
            System.out.println("Account Holder Name : " +accountHolderName );
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }
    public void checkBalance() {
        System.out.println("Balance in your account : $ " + balance);
    }
}
