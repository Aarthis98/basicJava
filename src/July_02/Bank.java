package July_02;

//throw is used


public class Bank {
    double balance = 2000;

    double getBalance() {
        return balance;
    }

    double deposit(double depositAmount) {
        balance = balance + depositAmount;
        return balance;
    }

    double withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            throw new RuntimeException("Insufficient Balance") ;

        }
        balance = balance - withdrawAmount;

        return withdrawAmount;
    }
}