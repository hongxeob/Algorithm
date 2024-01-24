import java.util.*;
public class Main {

	public static void main(String[] args) {
		// 1.N,K 입력 받음
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] n = new int[t];

		for (int i = 0; i < t; i++) {
			n[i] = sc.nextInt();
		}

		for (int j = 0; j < t; j++) {
			String binaryString = Integer.toBinaryString(n[j]);
			StringBuffer sb = new StringBuffer(binaryString);
			String reverse = sb.reverse().toString();
			String[] arr = reverse.split("");

			for (int k = 0; k < arr.length; k++) {
				if (arr[k].equals("1")) {
					System.out.print(k + " ");
				}
			}
		}
		System.out.println();
	}
}
