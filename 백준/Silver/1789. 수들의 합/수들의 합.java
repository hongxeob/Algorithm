import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum = 0;
        int cnt = 0;

        for (int i = 1; ; i++) {
            if (sum > num) break;
            sum += i;
            cnt++;
        }
        System.out.println(cnt - 1);
        sc.close();
    }
}