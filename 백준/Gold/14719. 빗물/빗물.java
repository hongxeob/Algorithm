import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[] heights = new int[W];
		int answer = 0;

		for (int i = 0; i < W; i++) {
			heights[i] = sc.nextInt();
		}

		for (int i = 1; i < W - 1; i++) {
			int currentHeight = heights[i]; //현재 벽 높이
			int leftMax = 0; // 왼쪽 벽 최대 높이
			int rightMax = 0; //오른쪽 벽 최대 높이

			//왼쪽에서 가장 긴 벽
			for (int j = 0; j <= i; j++) { // 이거를 포함 안하면 안됨.
				leftMax = Math.max(leftMax, heights[j]);
			}

			// 오른쪽에서 가장 긴 기둥
			for (int j = i; j < W; j++) {
				rightMax = Math.max(rightMax, heights[j]);
			}
			answer += Math.min(leftMax, rightMax) - currentHeight;
		}
		if (answer < 0) answer = 0;
		System.out.println(answer);

	}
}
