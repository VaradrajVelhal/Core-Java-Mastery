//WWrite a Java program to demonstrate exception propagation. Create a
//method that throws an ArithmeticException, and another method that calls
//this method and handles the exception.

import Program_5.Program5;

public class Program5 {
    void m() {
        int data = 50 / 0; // Throws ArithmeticException
    }

    // Method that calls m() and handles the error
    void n() {
        try {
            m();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in n()");
        }
    }

    public static void main(String[] args) {
        Program5 obj = new Program5();
        obj.n();
        System.out.println("Normal flow continues...");
    }
}
