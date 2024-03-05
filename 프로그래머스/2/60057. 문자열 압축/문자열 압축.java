import java.util.*;

class Solution {
    	public int solution(String s) {
		int min = Integer.MAX_VALUE;
		//길이를 한글자부터 s길이만큼 1)잘라서 2)압축 해보고 3)길이 비교
		for (int length = 1; length <= s.length(); length++) {
			//3. 길이비교
			int compressed = compressed(s, length);
			if (compressed < min) {
				min = compressed;
			}
		}
		return min;
	}

	//2.압축한 길이
	private int compressed(String src, int len) {
		StringBuilder sb = new StringBuilder();

		//직전 문자
		String last = "";
		//직전 문자 등장 횟수
		int cnt = 0;

		List<String> split = split(src, len);

		for (String token : split) {
			if (token.equals(last)) {
				cnt++;
			} else {
				if (cnt > 1) {
					sb.append(cnt);
				}
				sb.append(last);
				last = token;
				cnt = 1;
			}
		}
		//마지막 토큰은 last에 담겼지만 압축 문자열에는 포함 안되어 있으므로 한번더
		if (cnt > 1) {
			sb.append(cnt);
		}
		sb.append(last);

		return sb.length();
	}

	//1.문자를 length만큼 잘라서 배열로
	private List<String> split(String src, int len) {
		List<String> arr = new ArrayList<>();

		for (int startIdx = 0; startIdx < src.length(); startIdx += len) {
			int endIdx = startIdx + len;
			if (endIdx > src.length()) endIdx = src.length();
			arr.add(src.substring(startIdx, endIdx));
		}

		return arr;
	}
}