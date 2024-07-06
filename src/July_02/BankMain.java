package July_02;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        //BAlance check
       double balance = bank.getBalance();
        System.out.println("Current Balance " + balance);

        //Deposited
        double newbalance = bank.deposit(300);
        System.out.println("New Balance " + newbalance);

        //Withdraw
        double bal = bank.withdraw(4000);
        System.out.println(" Balance " + bal);
    }
}
