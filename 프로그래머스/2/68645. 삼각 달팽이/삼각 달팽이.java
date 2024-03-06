class Solution {
		public int[] solution(int n) {
		int[][] triangle = new int[n][n];
		int cnt = 1;
		int x = 0;
		int y = 0;

		while (true) {

			while (true) {
				triangle[y][x] = cnt++;
				if (y + 1 == n || triangle[y + 1][x] != 0) break;
				y += 1;
			}
			if (x + 1 == n || triangle[y][x + 1] != 0) break;
			x += 1;

			while (true) {
				triangle[y][x] = cnt++;
				if (x + 1 == n || triangle[y][x + 1] != 0) break;
				x += 1;
			}
			if (triangle[y - 1][x - 1] != 0) break;
			//왼쪽위로 가기 위해 한칸씩 빼준다
			x -= 1;
			y -= 1;

			//왼쪽 위로 갈때
			while (true) {
				triangle[y][x] = cnt++;
				if (triangle[y - 1][x - 1] != 0) break;
				x -= 1;
				y -= 1;
			}
			if (triangle[y + 1][x] != 0 || y + 1 == n) break;
            y += 1;
		}

		int[] answer = new int[cnt - 1];
		int idx = 0;
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j <= i; j++) {
				answer[idx++] = triangle[i][j];
			}
		}
		return answer;
	}
}