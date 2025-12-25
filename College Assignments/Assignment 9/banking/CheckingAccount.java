package banking;

public class CheckingAccount implements BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        // Simple checking logic
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}