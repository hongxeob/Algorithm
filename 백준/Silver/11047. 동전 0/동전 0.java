import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 동전 갯수
        int K = sc.nextInt(); // 동전 금액
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] <= K) {
                cnt += K / arr[i];
                K = K % arr[i];
            }
        }
        System.out.println(cnt);
    }
}