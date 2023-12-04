import java.util.*;

public class Solution {
    	public int[] solution(int[] arr) {
		List<Integer> set = new ArrayList<>();
		set.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				set.add(arr[i]);
			}
		}

		int[] answer = new int[set.size()];

		for (int i = 0; i < set.size(); i++) {
			answer[i] = set.get(i);
		}
		return answer;
	}
}