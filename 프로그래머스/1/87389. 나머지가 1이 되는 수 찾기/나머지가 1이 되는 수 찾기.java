class Solution {
	public int solution(int n) {
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			if (n % i == 1) {
				if (min > i) {
					min = i;
				}
			}
		}
		return min;
	}
}