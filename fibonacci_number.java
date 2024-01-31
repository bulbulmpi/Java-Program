
import java.util.*;

public class fibonacci_number {

    public static void main(String[] args) {
        int i, n, f, f0, f1;
        f0 = 0;
        f1 = 1;
        System.out.println("Enter the Number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (i = 1; i <= n; i++) {
            f = f0 + f1;
            System.out.print(f + " ");
            f1 = f0;
            f0 = f;
        }
    }
}
