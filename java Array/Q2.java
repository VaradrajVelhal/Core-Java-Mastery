import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size for array:- ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            System.out.println("Enter index");
            int index = sc.nextInt();
            System.out.println("Enter Element");
            int Element = sc.nextInt();
            arr[index] = Element;
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("the sum is :- " + sum);
    }
}
