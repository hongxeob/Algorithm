import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int re = pac(N) / (pac(N - k) * pac(k));
        System.out.println(re);

    }

    private static int pac(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * pac(n - 1);
        }
    }
}
