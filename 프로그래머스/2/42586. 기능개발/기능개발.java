import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       		List<Integer> list = new ArrayList<>();
		int[] worksDay = new int[progresses.length];

		for (int i = 0; i < speeds.length; i++) {
			worksDay[i] = (100 - progresses[i]) / speeds[i]; // 7,3,9
			if ((100 - progresses[i]) % speeds[i] != 0) {
				worksDay[i] += 1;
			}
		}

		int prev = worksDay[0];
		int cnt = 1;
		for (int i = 1; i < progresses.length; i++) {
			if (prev >= worksDay[i]) {
				cnt += 1;
			} else {
				list.add(cnt);
				cnt = 1;
				prev = worksDay[i];
			}
		}
		list.add(cnt);

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}