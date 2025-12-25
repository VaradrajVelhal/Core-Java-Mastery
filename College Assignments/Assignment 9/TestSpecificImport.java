import mypackage.Calculator;
//program 5

public class TestSpecificImport {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);

        // Message m = new Message(); ERROR (not imported)
    }
}
