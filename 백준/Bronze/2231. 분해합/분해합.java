import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;

        for (int i = 1; i < N; i++) {
            int num = function(i);
            if (num == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    }

    static int function(int n) {
        int temp = n;
        while (n != 0) {
            temp += n % 10;
            n /= 10;
        }
        return temp;
    }
}