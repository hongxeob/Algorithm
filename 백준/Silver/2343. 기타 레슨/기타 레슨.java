import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 레슨 갯수
        int M = sc.nextInt(); // 블루레이 갯수
        int[] arr = new int[N];
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (start < arr[i]) start = arr[i];
            end = end + arr[i];
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (sum + arr[i] > mid) {
                    cnt++;
                    sum = 0;
                }
                sum = sum + arr[i];
            }
            if (sum != 0) cnt++;
            if (cnt > M) start = mid + 1;
            else end = mid - 1;
        }
        System.out.println(start);
    }
}