import java.util.*;
class Solution {
	public int[] solution(int n, String[] words) {
		//가장 먼저 탈락하는 사람 번호, 그 사람이 자신의 몇번째 차례에 탈락
		int[] answer = {0, 0};

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if (i != 0) {
				String prev = words[i - 1];
				String now = words[i];
				char end = prev.charAt(prev.length() - 1);
				char start = now.charAt(0);
				if (map.containsKey(now) || end != start) {
					answer[0] = (i % n) + 1;
					answer[1] = (i / n) + 1;

					return answer;
				}
			}
			map.put(words[i], i);
		}
		return answer;
	}
}
