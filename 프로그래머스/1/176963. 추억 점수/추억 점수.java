import java.util.HashMap;
class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		//1.map에 name의 점수들을 담는다.
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}

		//2. photo의 배열에서 이름이 포함된 사람들의 숫자를 더한다.
		for (int i = 0; i < photo.length; i++) {
			int cnt = 0;
			for (int j = 0; j < photo[i].length; j++) {
				if (map.containsKey(photo[i][j])) {
					cnt += map.get(photo[i][j]);
				} else {
					continue;
				}
			}
			answer[i] = cnt;
		}
		return answer;
	}
}