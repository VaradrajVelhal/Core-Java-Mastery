package Program5;

import mathops.Addition;

public class SpecificImport {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println("Sum: " + a.add(5, 5));

        // Subtraction s = new Subtraction(); // This would cause an ERROR
    }
}
