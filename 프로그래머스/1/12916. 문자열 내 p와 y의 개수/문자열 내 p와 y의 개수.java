class Solution {
   boolean solution(String s) {
		boolean answer = true;
		int yCnt = 0;
		int pCnt = 0;

		//소문자로 전환
		s = s.toLowerCase();
		for (char c : s.toCharArray()) {
			//배열로 바꾼후 p,y 등장시 각 카운팅
			if (c == 'y') {
				yCnt++;
			} else if (c == 'p') {
				pCnt++;
			}
		}

		//하나도 없으면 true
		if (yCnt == 0 && pCnt == 0) {
			answer = true;
		}
		if (yCnt == pCnt) {
			answer = true;
		} else {
			answer = false;
		} 
		return answer;
	}
}