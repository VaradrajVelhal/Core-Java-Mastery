// Write a Java program to create a generic class Box<T> that can hold any
// type of object. Create instances of Box for different types and demonstrate
// adding and retrieving objects.
class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class Program5 {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.set(10);

        Box<String> strBox = new Box<>();
        strBox.set("Hello");

        System.out.println(intBox.get());
        System.out.println(strBox.get());
    }
}
