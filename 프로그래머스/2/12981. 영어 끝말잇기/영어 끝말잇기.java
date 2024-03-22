import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
				int[] answer = new int[2];

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < words.length; i++) {
			if (i != 0) {
				String prev = words[i - 1];
				String now = words[i];

				char end = prev.charAt(prev.length() - 1);
				char start = now.charAt(0);

				if (map.containsKey(now) || start != end) {
					answer[0] = (i % n) + 1;
					answer[1] = (i / n) + 1;
					return answer;
				}
			} 
				map.put(words[i], 1);
			

		}
		return answer;
	}
}