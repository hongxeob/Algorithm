class Solution {
	public String solution(String rsp) {
		String answer = "";
		String[] arr = rsp.split("");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("2")) {
				answer += "0";
			}
			if (arr[i].equals("0")) {
				answer += "5";
			}
			if (arr[i].equals("5")) {
				answer += "2";
			}
		}
		return answer;
	}
}