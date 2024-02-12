import java.util.*;
class Solution {
   	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		Map<Character, Integer> keypad = new HashMap<>();

		for (int i = 0; i < keymap.length; i++) {
			for (int j = 0; j < keymap[i].length(); j++) {
				if (keypad.containsKey(keymap[i].charAt(j))) {
					Integer curr = keypad.get(keymap[i].charAt(j));
					if (curr > j + 1) {
						keypad.put(keymap[i].charAt(j), j + 1);
					}
				} else {
					keypad.put(keymap[i].charAt(j), j + 1);
				}
			}
		}
		for (int i = 0; i < targets.length; i++) {
			int cnt = 0;
			for (int j = 0; j < targets[i].length(); j++) {
				char alpha = targets[i].charAt(j);
				Integer minClick = keypad.get(alpha);
				if (minClick != null) {
					cnt += minClick;
				} else {
					cnt = -1;
					break;
				} 
			}
			answer[i] = cnt;
		}
		return answer;
	}
}
