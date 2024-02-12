class Solution {
public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			String result = "";
			String a1 = Integer.toBinaryString(arr1[i]);
			String a2 = Integer.toBinaryString(arr2[i]);

			for (int j = 0; j < n; j++) {
				while (a1.length() < n) {
					a1 = "0" + a1;
				}
				while (a2.length() < n) {
					a2 = "0" + a2;
				}
				if (a1.charAt(j) == '1' || a2.charAt(j) == '1') {
					result += "#";
				} else if (a1.charAt(j) == '0' || a2.charAt(j) == '0') {
					result += " ";
				}
				answer[i] = result;
			}
		}
		return answer;
	}
}
