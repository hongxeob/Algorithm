class Solution {
    public String solution(String s) {
		String answer = "";
		String[] arr = s.toLowerCase().split("");
		boolean space = true;

		for (String ss : arr) {
			answer += space ? ss.toUpperCase() : ss;
			space = ss.equals(" ") ? true : false;
		}

		return answer;
	}
}