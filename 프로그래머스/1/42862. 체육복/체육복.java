import java.util.*;
class Solution {
   public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		Set<Integer> lostSet = new HashSet<>();
		Set<Integer> resSet = new HashSet<>();
		for (int i : reserve) {
			resSet.add(i);
		}
		for (int i : lost) {
			if (resSet.contains(i)) {
				resSet.remove(i);
			} else {
				lostSet.add(i);
			}
		}

		for (int i : resSet) {
			if (lostSet.contains(i - 1)) {
				lostSet.remove(i - 1);
			} else if (lostSet.contains(i + 1)) {
				lostSet.remove(i + 1);
			}
		}

		return n - lostSet.size();
	}
}