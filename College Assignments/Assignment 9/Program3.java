//Write a Java program to create a package utilities and define two classes
//Calculator and Converter in it. Use these classes in a main program to perform
//various calculations and conversions.

import utilities.*;

class Program3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Converter conv = new Converter();

        System.out.println("Sum: " + calc.add(10, 20));
        System.out.println("30C in F: " + conv.cToF(30));
    }
}
