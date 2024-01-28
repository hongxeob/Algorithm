import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		int[] n = new int[10];

		for (int i = 0; i < t; i++) {
			for (int j = 0; j < n.length; j++) {
				n[j] = sc.nextInt();
			}
			Arrays.sort(n);
			
			System.out.println(n[7]);
		}

	}
}
