import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int max = 0;
		int human = 0;

		for (int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int out = Integer.parseInt(st.nextToken());
			int in = Integer.parseInt(st.nextToken());

			human -= out;
			human += in;

			if (human > max) {
				max = human;
			}
		}
		System.out.println(max);
	}
}