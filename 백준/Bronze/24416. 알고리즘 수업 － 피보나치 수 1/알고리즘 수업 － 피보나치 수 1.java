import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int cnt = 0;
    static int cnt2 = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fib(N);
        fibonacci(N);
        System.out.println(cnt + " " + cnt2);
    }

    static int fib(int n) {
        if (n <= 2) {
            cnt++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int fibonacci(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < n; i++) {
            cnt2++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n - 1];
    }
}
