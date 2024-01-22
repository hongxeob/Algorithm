import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<>();

		for (String[] clothe : clothes) {
			String type = clothe[1];
			map.put(type, map.getOrDefault(type, 0) + 1);
		}
		for (Integer value : map.values()) {
			answer *= value + 1;
		}
		return answer - 1;
	}
}
