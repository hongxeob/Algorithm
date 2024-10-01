class Solution {
    public long solution(int price, int money, int count) {
		long answer = 0;
		long rest = 0;
		for (int i = 1; i <= count; i++) {
			rest += price * i;
		}
		return rest <= money ? answer : rest - money;
	}
}
