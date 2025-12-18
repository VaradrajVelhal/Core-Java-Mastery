package Java_Basics;

public class stringClasses {
    public static void main(String[] args) {
        String str1 = "Hello";
        str1.concat("World");
        // If we print str1 now it will print "Hello" because Stins are Immutable means
        // we cannot change then
        // Thats why String builder and String buffer was introduced to overcome this
        // limitataion and other limitatations
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world").append(" !!");
        System.out.println(sb);// Output :- Hello world !!

        // String Builders are mutable
        // We can do method chaining -> sb.append(" world").append(" !!");
        // SB is not thread safe

        StringBuffer sb1 = new StringBuffer();
        // String Buffer are thread safe
        // Mutable
        // Method chaining
    }
}
