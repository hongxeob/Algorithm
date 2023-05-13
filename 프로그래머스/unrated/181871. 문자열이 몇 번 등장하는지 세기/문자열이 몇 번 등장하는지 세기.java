class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length(); i++) {
            String substring = myString.substring(i);
            if (substring.startsWith(pat)) {
                answer++;
            }
        }
        return answer;
    }
}