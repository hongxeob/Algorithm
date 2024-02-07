import java.util.TreeSet;
class Solution {
	public int[] solution(int[] numbers) {
		int sum = 0;

		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		int[] answer = new int[set.size()];
		int temp = 0;
		for (Integer i : set) {
			answer[temp++] = i;
		}
		return answer;
	}
}