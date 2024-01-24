import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 1.N,K 입력 받음
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		// 2. N의 약수 구한다.
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				list.add(i);
			}
		}

		// 3. K-1 번째 숫자 구하기.
		System.out.println(list.size() < K ? 0 : list.get(K - 1));
	}
}