import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] fib = new int[N + 1];

        for (int i = 0; i < fib.length; i++) {
            if (i == 0) fib[0] = 0;
            else if (i == 1) {
                fib[1] = 1;
            } else {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        System.out.println(fib[N]);
    }
}
