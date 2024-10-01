class Solution {
    public long solution(int price, int money, int count) {
		long answer = 0;
		long rest = 0;
		for (int i = 1; i <= count; i++) {
			rest += price * i;
		}
		if (rest <= money) {
			return answer;
		} else {
			return rest - money;
		}
	}
}
