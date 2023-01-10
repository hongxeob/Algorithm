class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        long pay = sum - money;
        answer = (pay > 0) ? pay : 0;
        return answer;
    }
}