import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);
        System.out.println(sb);
    }

    static void dfs(int number, int jarisu) {
        if (jarisu == N) {
            if (isPrime(number)) {
                sb.append(number).append("\n");
            }
            return;
        }
        for (int i = 1; i <= 9; i += 2) {
            if (isPrime(number * 10 + i)) {
                dfs(number * 10 + i, jarisu + 1);
            }
        }
    }

    static boolean isPrime(int number) {
        double sqrt = Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}