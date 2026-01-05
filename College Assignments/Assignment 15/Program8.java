// Write a Java program to implement a custom collection class that behaves
// like a basic List. Implement methods such as add(), remove(), get(), and
// size().
class MyList {
    int[] arr = new int[10];
    int size = 0;

    void add(int value) {
        arr[size++] = value;
    }

    int get(int index) {
        return arr[index];
    }

    void remove(int index) {
        for (int i = index; i < size - 1; i++)
            arr[i] = arr[i + 1];
        size--;
    }

    int size() {
        return size;
    }
}

public class Program8 {
    public static void main(String[] args) {

        MyList list = new MyList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(1);

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
