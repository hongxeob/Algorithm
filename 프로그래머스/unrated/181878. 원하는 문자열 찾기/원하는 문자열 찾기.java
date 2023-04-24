class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myString_ = myString.toLowerCase();
        String s = pat.toLowerCase();
        if (myString.length() < pat.length()) {
            answer = 0;
        }
        if (myString_.contains(s)) {
            answer = 1;
        }
        return answer;
    }
}