class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
		boolean endsWith = my_string.endsWith(is_suffix);
		if (endsWith) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		return answer;
    }
}