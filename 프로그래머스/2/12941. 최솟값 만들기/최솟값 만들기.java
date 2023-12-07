import java.util.Collections;
import java.util.PriorityQueue;

class Solution
{
    public static int solution(int[] A, int[] B) {
		int ans = 0;
		PriorityQueue<Integer> a = new PriorityQueue<>();
		PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < A.length; i++) {
			a.add(A[i]);
			b.add(B[i]);
		}

		while (!a.isEmpty()) {
			ans += a.poll() * b.poll();
		}

		return ans;
	}
}