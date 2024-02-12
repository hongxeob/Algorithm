import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
public String solution(String s, String skip, int index) {
		String[] temp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		List<String> list = new ArrayList<>(List.of(temp));

		for (int i = 0; i < skip.length(); i++) {
			list.remove(String.valueOf(skip.charAt(i)));
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int sIdx = list.indexOf(String.valueOf(s.charAt(i)));
			int nextIdx = (sIdx + index) % list.size();
			sb.append(list.get(nextIdx));
		}
		return sb.toString();
	}
}
