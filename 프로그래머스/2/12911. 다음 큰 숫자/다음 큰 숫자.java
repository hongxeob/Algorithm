class Solution {
	public int solution(int n) {
		int answer = 0;
		int nOneCnt = Integer.bitCount(n);
		int answerOneCnt = 0;
		while (true) {
			n++;
			answerOneCnt = Integer.bitCount(n);
			if (nOneCnt == answerOneCnt) {
				answer = n;
				break;
			}
		}
		return answer;
	}
}