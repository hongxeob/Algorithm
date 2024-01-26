import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[10];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++) {
				a[j] = sc.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[7]);
		}

	}
}