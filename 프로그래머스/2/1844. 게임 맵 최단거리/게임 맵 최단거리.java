import java.util.LinkedList;
import java.util.Queue;
class Solution {
   	int m, n;
	int answer = -1;
	int dx[] = {-1, 1, 0, 0};
	int dy[] = {0, 0, -1, 1};
	int[][] maps, visited;

	
	void bfs() {
		visited[0][0] = 1;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{0, 0});

		while (!q.isEmpty()) {
			int[] curr = q.remove();
			int y = curr[0];
			int x = curr[1];

			for (int i = 0; i < 4; i++) {
				int ny = y + dy[i];
				int nx = x + dx[i];
				if (ny >= m || ny < 0 || nx >= n || nx < 0) continue;
				if (visited[ny][nx] == 0 && maps[ny][nx] == 1) {
					visited[ny][nx] = visited[y][x] + 1;
					q.add(new int[]{ny, nx});
				}
			}
		}
	}

	public int solution(int[][] maps) {
		int answer = 0;
		m = maps.length;
		n = maps[0].length;
		visited = new int[m][n];
		this.maps = maps;

		bfs();
		answer = visited[m - 1][n - 1] == 0 ? -1 : visited[m - 1][n - 1];
		return answer;
	}

}