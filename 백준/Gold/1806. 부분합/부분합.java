import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] arr = new int[N];

		int start = 0;
		int end = 0;
		int len = Integer.MAX_VALUE;
		int sum = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		while (true) {
			if (sum >= S) {
				sum -= arr[start++];
				len = Math.min(len, (end - start) + 1);
			} else if (end == N) {
				break;
			} else {
				sum += arr[end++];
			}
		}
		if (len == Integer.MAX_VALUE) {
			System.out.println(0);
		} else {
			System.out.println(len);
		}
	}

}
