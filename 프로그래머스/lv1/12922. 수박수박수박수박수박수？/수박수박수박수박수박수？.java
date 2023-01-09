class Solution {
    public String solution(int n) {
        String answer = "";
        String a = "수";
        String b = "박";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += b;
            } else {
                answer += a;
            }
        }
        return answer;
    }
}