class Solution {
    public int solution(int[] num_list) {
		int answer = 0;
		int num1 = 1;
		int num2 = 0;
		for (int i = 0; i < num_list.length; i++) {
			num1 *= num_list[i];
			num2 += num_list[i];
		}

		return num1 < Math.pow(num2, 2) ? 1 : 0;
	}
}