import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int sum = 0;
        int answer = 0;

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        answer = getAnswer(N, M, answer, arr);
        System.out.println(answer);
    }

    private static int getAnswer(int N, int M, int answer, int[] arr) {
        int sum;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum > answer && sum <= M) {
                        answer = sum;
                    }
                }
            }
        }
        return answer;
    }
}