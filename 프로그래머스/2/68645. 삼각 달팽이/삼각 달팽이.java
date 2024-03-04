class Solution {
	public int[] solution(int n) {
		int[][] tree = new int[n][n];
		int v = 1;
		int x = 0;
		int y = 0;

		while (true) {
			while (true) {
				//아래로 이동
				tree[y][x] = v++;
				if (y + 1 == n || tree[y + 1][x] != 0) break;
				y += 1;
			}

			//아래로 진행하는 것이 삼각형을 채우는 마지막 진행 방향이면 멈춘다.
			if (x + 1 == n || tree[y][x + 1] != 0) break;
			x += 1;

			while (true) {
				//오른쪽으로 이동
				tree[y][x] = v++;
				if (x + 1 == n || tree[y][x + 1] != 0) break;
				x += 1;
			}
			if (tree[y - 1][x - 1] != 0) break;
			x -= 1;
			y -= 1;

			while (true) {
				//왼쪽 위로 이동
				tree[y][x] = v++;
				if (tree[y - 1][x - 1] != 0) break;
				x -= 1;
				y -= 1;
			}
			if (y + 1 == n || tree[y + 1][x] != 0) break;
			y += 1;
		}
		int[] answer = new int[v - 1];
		int idx = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				answer[idx++] = tree[i][j];
			}
		}
		return answer;
	}
}