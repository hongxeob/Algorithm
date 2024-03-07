import java.util.*;

class Solution {
    public int solution(String s) {
		int min = Integer.MAX_VALUE;
		for (int length = 1; length <= s.length(); length++) {
			int compressed = compressed(s, length);
			if (compressed < min) {
				min = compressed;
			}
		}
		return min;
	}

	private static int compressed(String src, int len) {
		String last = "";
		int count = 0;
		StringBuilder sb = new StringBuilder();
		List<String> list = getStrings(src, len);

		for (String token : list) {
			if (token.equals(last)) {
				count++;
			} else {
				if (count > 1) {
					sb.append(count);
				}
				sb.append(last);
				last = token;
				count = 1;
			}
		}
		if (count > 1) {
			sb.append(count);
		}
		sb.append(last);

		return sb.length();
	}

	private static List<String> getStrings(String s, int length) {
		List<String> list = new ArrayList<>();

		for (int startIdx = 0; startIdx < s.length(); startIdx+=length) {
			int endIdx = startIdx + length;
			if (endIdx > s.length()) endIdx = s.length();
			list.add(s.substring(startIdx, endIdx));
		}
		return list;
	}
}
