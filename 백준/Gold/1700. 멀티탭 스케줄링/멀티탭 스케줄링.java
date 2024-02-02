import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> rotation = new ArrayList<>();

		for (int i = 0; i < K; i++) {
			rotation.add(sc.nextInt());
		}

		Set<Integer> using = new HashSet<>();
		int cnt = 0;

		for (int i = 0; i < K; i++) {
			int goods = rotation.get(i);
			if (using.contains(goods)) continue;
			if (using.size() < N && using.add(goods)) continue;

			int max = -1, idx = -1;

			for (int socketInGoods : using) {
				int distance = 0;
				List<Integer> sub = rotation.subList(i + 1, K);

				//만약 교체하려는 용품이 현재 위치 이후의 전체 용품 순서중에 존재하는지 확인
				if (sub.contains(socketInGoods)) {
					//얼마나 멀리 있는지 확인
					distance = sub.indexOf(socketInGoods) + 1;
				//나타나지 않았을 때
				} else {
					distance = K - i - 1;
				}
				if (distance > max) {
					max = distance;
					idx = socketInGoods;
				}
			}
			using.remove(idx);
			using.add(goods);
			cnt++;
		}
		System.out.println(cnt);
		
	}
}
