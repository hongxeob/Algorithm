import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] n = new int[T];

		for (int i = 0; i < n.length; i++) {
			String binaryString = Integer.toBinaryString(Integer.parseInt(br.readLine()));
			StringBuffer sb = new StringBuffer(binaryString);
			String reverse = sb.reverse().toString();
			String[] arr = reverse.split("");

			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("1")) {
					System.out.print(j + " ");
				}
			}
		}
		
		System.out.println();
	}
}
