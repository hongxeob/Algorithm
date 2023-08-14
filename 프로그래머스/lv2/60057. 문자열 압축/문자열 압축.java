import java.util.*;

class Solution {
    public int solution(String s) {
        int min = Integer.MAX_VALUE;
        for (int length = 1; length <= s.length(); length++) {
            int compressed = compress(s, length);
            if (compressed < min) {

                min = compressed;
            }
        }
        return min;
    }

    private int compress(String src, int length) {
        StringBuilder sb = new StringBuilder();

        String last = "";
        int cnt = 0;

        for (String token : split(src, length)) {
            if (token.equals(last)) {
                cnt++;
            } else {
                if (cnt > 1) sb.append(cnt);
                sb.append(last);
                last = token;
                cnt = 1;
            }
        }

        if (cnt > 1) sb.append(cnt);
        sb.append(last);

        return sb.length();
    }

    private List<String> split(String src, int length) {
        ArrayList<String> tokens = new ArrayList<>();

        for (int startIdx = 0; startIdx < src.length(); startIdx += length) {
            int endIdx = startIdx + length;
            if (endIdx > src.length()) endIdx = src.length();
            tokens.add(src.substring(startIdx, endIdx));
        }
        return tokens;
    }
}