class Solution {
    public int solution(int n) {
		int answer = 0;
		while (n > 0) {
			int temp = 0;
			temp = n % 10;
			answer += temp;
			n /= 10;
		}
		return answer;
	}
}