class Solution {
   public int solution(int n) {
        int answer = 0;
        int fit = n % 7;
        if (fit == 0) {
            answer = n / 7;
        } else {
            answer = n / 7 + 1;
        }
        return answer;
    }
}