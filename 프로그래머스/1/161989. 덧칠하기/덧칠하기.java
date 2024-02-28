class Solution {
    public int solution(int n, int m, int[] section) {
		int answer = 0;
		int paintedBefore = 0;

		for (int i = 0; i < section.length; i++) {
			// 칠해야하는 부분이 칠해진 부분에 속한다면 (이미 칠해졌다면)
			if (section[i] < paintedBefore) {
				continue;
			}
			answer++;
			// 다시 더 칠했다는 말이므로 filled는 현재 칠해야하는 섹션 + 롤러의 길이
			// 즉 paintedBefore 해당 값 전까지 칠해져 있다. ex: 6이면 5까지 칠해져있음.
			paintedBefore = section[i] + m;
		}
		return answer;
	}
}
