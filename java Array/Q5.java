import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
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
        int l = 0;
        int r = size - 1;
        while (l <= r) {
            int temp;
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
