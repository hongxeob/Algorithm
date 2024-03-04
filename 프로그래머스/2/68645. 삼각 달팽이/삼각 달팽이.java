class Solution {
		public int[] solution(int n) {
		int[][] tree = new int[n][n];
		int cnt = 1;
		int x = 0;
		int y = 0;

		while (true) {
			//아래로 갈 때 
			while (true) {
				tree[y][x] = cnt++;
				if (y + 1 == n || tree[y + 1][x] != 0) break;
				y += 1;
			}
			if (x + 1 == n || tree[y][x + 1] != 0) break;
			x += 1;

			//오른쪽으로 갈 때
			while (true) {
				tree[y][x] = cnt++;
				if (x + 1 == n || tree[y][x + 1] != 0) break;
				x += 1;
			}
			if (tree[y - 1][x - 1] != 0) break;
			//왼쪽위로 가기 위해 한칸씩 빼준다
			x -= 1;
			y -= 1;

			//왼쪽 위로 갈때
			while (true) {
				tree[y][x] = cnt++;
				if (tree[y - 1][x - 1] != 0) break;
				x -= 1;
				y -= 1;
			}
			if (tree[y + 1][x] != 0 || y + 1 == n) break;
            y += 1;
		}

		int[] answer = new int[cnt - 1];
		int idx = 0;
		for (int i = 0; i < tree.length; i++) {
			for (int j = 0; j <= i; j++) {
				answer[idx++] = tree[i][j];
			}
		}
		
		return answer;
	}
}