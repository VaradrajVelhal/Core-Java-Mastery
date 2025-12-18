package Garbage_Collection;

public class GarbageCollection {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", "16 pro max");
        // here the phone object is pointing towards the memory location of our phone
        // its created at HEAP
        System.out.println(phone);
        // if we point the phone to null
        phone = null;
        System.out.println(phone);
        // now the phones value is null so it is not pointing towards anything
        // so where the value of the phone goes ????
        // the answer is the value is taken care by JVM it is removed to save space

        // ex. we remove things from our house that are not useful anymore

    }
}

class Phone {
    private String company;
    private String model;

    public Phone(String company, String model) {
        this.company = company;
        this.model = model;
    }

    @Override
    public String toString() {
        return "phone [company=" + company + ", model=" + model + "]";
    }

}
