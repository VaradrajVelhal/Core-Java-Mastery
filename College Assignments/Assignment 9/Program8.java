//Write a Java program to create a package banking and define an interface
//BankAccount with methods deposit(), withdraw(), and getBalance().
//Implement this interface in two classes SavingsAccount and CheckingAccount.

import banking.*;

public class Program8 {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount();
        s.deposit(1000);
        s.withdraw(200);
        System.out.println("Savings Balance: " + s.getBalance());

        BankAccount c = new CheckingAccount();
        c.deposit(500);
        c.withdraw(600); // Checking might allow negative
        System.out.println("Checking Balance: " + c.getBalance());
    }
}