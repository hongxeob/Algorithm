import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score); // 오름차순으로 정렬

		//높은 가격의 위부터 m개씩 자르며 answer에 더해준다.
		for (int i = score.length - m; i >= 0; i -= m) {
			answer += score[i] * m;
		}
		return answer;
	}
}