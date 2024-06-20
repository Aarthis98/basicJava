package Assignment3;

public class BankMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Aarthi", 1000.0);
        BankAccount acc2 = new BankAccount(1002, "Gowtham", 2000.0);
        BankAccount.displayTotalAccounts();

        acc1.deposit(300.0);
        acc1.checkBalance();
        acc2.withdraw(100.0);
        acc2.checkBalance();
    }
}
