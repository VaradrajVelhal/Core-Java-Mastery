package banking;

public class SavingsAccount implements BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in Savings");
        }
    }

    public double getBalance() {
        return balance;
    }
}