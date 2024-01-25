import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int max = 0;

		int[][] passenger = new int[10][2];

		for (int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			passenger[i][0] = Integer.parseInt(st.nextToken());
			passenger[i][1] = Integer.parseInt(st.nextToken());

			sum = sum - passenger[i][0] + passenger[i][1];

			if (max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
