import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            StringBuilder sb = new StringBuilder();
            int n = sc.nextInt();
            if (n == -1) break;

            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sb.append(i + " + ");
                    sum += i;
                }
            }
            int length = sb.length();
            System.out.println(n == sum ? n + " = " + sb.toString().substring(0, length - 3)
                    : n + " is NOT perfect.");
        }
    }
}