import mypackage.*;
//program 5

public class TestPackageImport {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5, 5);

        Message m = new Message();
        m.show();
    }
}
