//Write a Java program to demonstrate how to handle naming conflicts when
//two packages have classes with the same name. Create two packages, each
//with a class named Utils, and show how to use both classes in the same program.

import packageA.Utils; // 1. Import one class normally

public class Program7 {
    public static void main(String[] args) {
        // 2. Uses the imported 'packageA.Utils'
        Utils u1 = new Utils();
        u1.print();

        // 3. Use the FULL name for the second class to avoid confusion
        packageB.Utils u2 = new packageB.Utils();
        u2.print();
    }
}