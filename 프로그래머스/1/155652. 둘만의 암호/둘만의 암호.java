import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
public String solution(String s, String skip, int index) {
		String[] temp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

		List<String> alpha = new ArrayList<>(Arrays.asList(temp));

		//skip 문자를 리스트에서 제거
		for (int i = 0; i < skip.length(); i++) {
			alpha.remove(String.valueOf(skip.charAt(i)));
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			//s를 잘라서 인덱스 만큼 더 해준다.
			int sIdx = alpha.indexOf(String.valueOf(s.charAt(i)));
			int nextIdx = (sIdx + index) % alpha.size();
			sb.append(alpha.get(nextIdx));
		}
		return sb.toString();
	}
}