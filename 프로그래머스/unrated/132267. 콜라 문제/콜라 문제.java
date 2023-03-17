class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            if (n < a) {
                break;
            }
            int givenMart = (n / a) * b;
            answer += givenMart;
            int remain = n % a;
            n = givenMart + remain;
        }
        return answer;
    }
}