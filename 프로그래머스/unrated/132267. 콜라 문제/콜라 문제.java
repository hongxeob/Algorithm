class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            if (n < a) {
                break;
            }
            int givenMart = (n / a) * b; //마트에서 주는 병 수
            answer += givenMart;
            int remain = n % a; // 남은병
            n = givenMart + remain; // 마트에서 받은 병 + 남은병 (현재 병)
        }
        return answer;
    }
}