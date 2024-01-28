import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static ArrayList<Integer> num = new ArrayList<>();
	static ArrayList<Integer> operator = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer str1 = new StringTokenizer(br.readLine());
		StringTokenizer str2 = new StringTokenizer(br.readLine());

		for (int i = 0; str1.hasMoreTokens(); i++) {
			num.add(Integer.parseInt(str1.nextToken()));
		}

		for (int i = 0; str2.hasMoreTokens(); i++) {
			operator.add(Integer.parseInt(str2.nextToken()));
		}
		dfs(num.get(0), 1);
		System.out.println(max);
		System.out.println(min);
	}

	public static void dfs(int a, int depth) {
		//종료 조건
		if (depth == N) {
			max = Math.max(max, a);
			min = Math.min(min, a);
			return;
		}

		//반복 실행문
		for (int i = 0; i < 4; i++) {
			if (operator.get(i) > 0) {
				operator.set(i, operator.get(i) - 1);

				switch (i) {
					case 0:
						dfs(a + num.get(depth), depth + 1);
						break;
					case 1:
						dfs(a - num.get(depth), depth + 1);
						break;
					case 2:
						dfs(a * num.get(depth), depth + 1);
						break;
					case 3:
						dfs(a / num.get(depth), depth + 1);
						break;
				}
				operator.set(i, operator.get(i) + 1);
			}
		}
	}
}
