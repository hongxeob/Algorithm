import java.util.HashMap;
class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		//1.map에 name의 점수들을 담는다.
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}

		for (int i = 0; i < photo.length; i++) {
			int sum = 0;
			for (int j = 0; j < photo[i].length; j++) {
				if (map.containsKey(photo[i][j])) {
					sum += map.get(photo[i][j]);
				} else {
					continue;
				}
			}
			answer[i] = sum;
		}
		return answer;
	}
}