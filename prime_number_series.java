
import java.util.Scanner;

public class prime_number_series {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i, j;
        System.out.println("Enter the Last Number");
        n = s.nextInt();
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(" " + i);
            }
        }
    }
}
