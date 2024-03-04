import java.util.*;

class Solution {
    	public int[] solution(int N, int[] stages) {
		HashMap<Integer, Double> map = new HashMap<>();

		for (int i = 1; i <= N; i++) {
			double total = 0;
			double fail = 0;
			for (int j = 0; j < stages.length; j++) {
				if (i < stages[j]) {
					total++;
				}
				if (i == stages[j]) {
					fail++;
				}
			}
			if (total == 0 && fail == 0) {
				total = 1;
			}
			map.put(i, fail / total);
		}

		int[] answer = new int[N];
		for (int i = 0; i < N; i++) {
			double max = -1;
			int stage = 0;
			for (int key : map.keySet()) {
				if (max < map.get(key)) {
					max = map.get(key);
					stage = key;
				}
			}
			answer[i] = stage;
            map.remove(stage);
		}

		return answer;
	}
}