import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
		List<Integer> list = new ArrayList<>();
		int[] works = new int[progresses.length];

		for (int i = 0; i < speeds.length; i++) {
			works[i] = (100 - progresses[i]) / speeds[i];
			if ((100 - progresses[i]) % speeds[i] != 0) {
				works[i] += 1;
			}
		}

		int prev = works[0];
		int cnt = 1;

		for (int i = 1; i < progresses.length; i++) {
			if (prev >= works[i]) {
				cnt++;
			} else {
				list.add(cnt);
				cnt = 1;
				prev = works[i];
			}
		}
		list.add(cnt);
		int[] answer = new int[list.size()];

        for (int i = 0; i <list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}