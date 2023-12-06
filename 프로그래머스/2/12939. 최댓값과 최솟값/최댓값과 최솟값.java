class Solution {
    public String solution(String s) {
		String answer = "";
		int max, min;
		String[] arr = s.split(" ");
		min = max = Integer.parseInt(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			max = Math.max(Integer.parseInt(arr[i]), max);
			min = Math.min(min, Integer.parseInt(arr[i]));
		}
		answer = min + " " + max;
        
		return answer;
	}
}