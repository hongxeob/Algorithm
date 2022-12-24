class Solution {
    final int BONUS_NUM = 10;

    public int solution(int chicken) { // 1081
        int answer = 0;
        while (chicken >= BONUS_NUM) {
            int couponAndChicken = chicken / BONUS_NUM; // 108 // 10 // 1 // 1 
            int restCoupon = chicken % BONUS_NUM; // 1 //9 //9//0
            chicken = couponAndChicken + restCoupon; // 109 // 19 // 10//1
            answer += couponAndChicken;//108+10+1+1
        }
        return answer;
    }
}