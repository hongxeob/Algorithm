import java.util.*;
class Solution {
   	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		Map<Character, Integer> keypad = new HashMap<>();

		for (int i = 0; i < keymap.length; i++) {
			for (int j = 0; j < keymap[i].length(); j++) {
				if (keypad.containsKey(keymap[i].charAt(j))) {
					Integer current = keypad.get(keymap[i].charAt(j));
					if (current > (j + 1)) {
						keypad.put(keymap[i].charAt(j), j + 1);
					}
				} else {
					keypad.put(keymap[i].charAt(j), j + 1);
				}
			}
		}
		for (int i = 0; i < targets.length; i++) {
			int nCnt = 0;
			for (int j = 0; j < targets[i].length(); j++) {
				char alpha = targets[i].charAt(j);
				Integer nMinClick = keypad.get(alpha);
				if (nMinClick != null) {
					nCnt += nMinClick;
				} else {
					nCnt = -1;
					break;
				}
			}
			answer[i] = nCnt;
		}
		return answer;
	}
}