import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 배열 안의 값들 입력 받고
        }
        Arrays.sort(arr); // 오름차순 정렬
        System.out.println(arr[0] + " " + arr[N - 1]);
        // 가장 작은 숫자는 배열의 첫번째, 가장 큰 수는 배열의 마지막에!
    }
}


