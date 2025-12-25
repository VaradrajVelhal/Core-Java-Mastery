//Write a Java program to demonstrate the use of static import. Create a class
//MathOperations with static methods add(), subtract(), and multiply(). Use
//static import to access these methods in another class without using the class name.

// The 'static' keyword here is the magic sauce
import static myutils.MathOperations.*;

public class Program6 {
    public static void main(String[] args) {
        // No need to write MathOperations.add()
        System.out.println("Add: " + add(20, 10));
        System.out.println("Sub: " + subtract(20, 10));
        System.out.println("Mul: " + multiply(20, 10));
    }
}