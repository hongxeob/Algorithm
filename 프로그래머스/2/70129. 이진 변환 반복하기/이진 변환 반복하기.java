class Solution {
    	public int[] solution(String s) { // 110010101001
		int[] answer = new int[2];
		int loop = 0;
		int removed = 0;

		while (!s.equals("1")) {
			int zero = 0;
			for (char c : s.toCharArray()) {
				if (c == '0') {
					zero++;
				}
			}
			loop += 1;
			removed += zero;

			int ones = s.length() - zero;
			s = Integer.toString(ones, 2);
		}
		answer[0] = loop;
		answer[1] = removed;
		return answer;
	}
}