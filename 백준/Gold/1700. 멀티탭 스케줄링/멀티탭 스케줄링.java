import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			list.add(sc.nextInt());
		}

		Set<Integer> set = new HashSet<>();

		int cnt = 0;
		for (int i = 0; i < k; i++) {
			int num = list.get(i);
			if (set.contains(num)) continue;
			if (set.size() < n && set.add(num)) continue;

			int max = -1, idx = -1;
			for (int s : set) {
				int temp = 0;
				List<Integer> sub = list.subList(i + 1, k);
				if (sub.contains(s)) {
					temp = sub.indexOf(s) + 1;
				} else {
					temp = k - i - 1;
				}
				if (temp > max) {
					max = temp;
					idx = s;
				}
			}
			set.remove(idx);
			set.add(num);
			cnt++;
		}
		System.out.println(cnt);
	}
}