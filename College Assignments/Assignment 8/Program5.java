//Write a Java program to create an abstract class Account with an abstract
//method calculateInterest(double balance).Create subclasses SavingsAccount and
//CheckingAccount that implement the method differently.
abstract class Account {
    abstract double calculateInterest(double balance);
}

class SavingsAccount extends Account {
    double calculateInterest(double balance) {
        return balance * 0.05; // 5% interest
    }
}

class CheckingAccount extends Account {
    double calculateInterest(double balance) {
        return balance * 0.01; // 1% interest
    }
}

class Program5 {
    public static void main(String args[]) {
        Account sa = new SavingsAccount();
        Account ca = new CheckingAccount();

        System.out.println("Savings Interest: " + sa.calculateInterest(1000));
        System.out.println("Checking Interest: " + ca.calculateInterest(1000));
    }
}
