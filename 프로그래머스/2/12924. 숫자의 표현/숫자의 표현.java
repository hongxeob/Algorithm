class Solution {
public int solution(int n) {
		int answer = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int temp = 0;
			for (int j = i; j <= n; j++) {
				temp = temp + j;
				if (temp == n) {
					answer++;
				} else if (temp > n) {
					break;
				}
			}
		}
		return answer;
	}
}