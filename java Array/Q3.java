import java.util.Scanner;

public class Q3 {
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
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("max element is : " + max);
    }
}
