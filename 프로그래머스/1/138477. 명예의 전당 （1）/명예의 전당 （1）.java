import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		//리스트 만들기
		ArrayList<Integer> daily = new ArrayList<>();
		for (int i = 0; i < score.length; i++) {
			if (daily.size() < k) {
				daily.add(score[i]);
				Collections.sort(daily);
				answer[i] = daily.get(0);
				continue;
			}
			if (daily.size() == k) {
				int minScore = daily.get(0);
				if (minScore < score[i]) {
					daily.remove(0);
					daily.add(score[i]);
					Collections.sort(daily);
				}
				answer[i] = daily.get(0);
			}
		}
		return answer;
	}
}
