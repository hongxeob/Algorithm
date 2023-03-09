class Solution {
     public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        long pay = sum - money;
        return pay > 0 ? pay : 0;
    }
}