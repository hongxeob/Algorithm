import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (N-- > 0) {
            int K = sc.nextInt();
            max = K > max ? K : max;
            min = K < min ? K : min;
        }
        System.out.println(max * min);
    }
}
