import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] N = new int[9];
		int sum = 0;
		int fake1 = 0;
		int fake2 = 0;

		for (int i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(br.readLine());
			sum += N[i];
		}

		Arrays.sort(N);

		for (int i = 0; i < N.length; i++) {
			for (int j = i + 1; j < N.length; j++) {
				if (sum - N[i] - N[j] == 100) {
					fake1 = N[i];
					fake2 = N[j];
				}
			}
		}
		for (int i = 0; i < N.length; i++) {
			if (N[i] == fake1 || N[i] == fake2) {
				continue;
			} else {
				System.out.println(N[i]);
			}
		}
	}
}
