
import java.util.Scanner;

public class array_sum {

    public static void main(String[] args) {
        int n, i, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = s.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        System.out.println("Array elements are: ");
        for (i = 0; i < n; i++) {
            sum = sum + array[i];
            System.out.println(array[i]);
        }
        System.out.println("Sum of Array is :" + sum);
    }
}
