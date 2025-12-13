import mathops.*; // Brings in Addition AND Subtraction

public class WildcardImport {
    public static void main(String[] args) {
        Addition a = new Addition();
        Subtraction s = new Subtraction(); // Works fine here

        System.out.println("Sum: " + a.add(10, 5));
        System.out.println("Diff: " + s.sub(10, 5));
    }
}