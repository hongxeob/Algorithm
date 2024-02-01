import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] arr = new int[n];

		int start = 0;
		int end = 0;
		int len = Integer.MAX_VALUE;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		while (true) {
			if (sum >= s) {
				sum -= arr[start++];
				len = Math.min(len, (end - start) + 1);
			} else if (end == n) {
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
