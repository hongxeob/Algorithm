import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[] heights = new int[W];
		int answer = 0;

		for (int i = 0; i < W; i++) {
			heights[i] = sc.nextInt();
		}

		for (int i = 1; i < W - 1; i++) {
			int currentHeight = heights[i];
			int leftMax = 0;
			int rightMax = 0;

			for (int j = 0; j <= i; j++) {
				leftMax = Math.max(leftMax, heights[j]);
			}
			for (int j = i; j < W; j++) {
				rightMax = Math.max(rightMax, heights[j]);
			}
			answer += Math.min(rightMax, leftMax) - currentHeight;
		}
		if (answer < 0) answer = 0;
		System.out.println(answer);
	}
}
