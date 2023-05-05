class Solution {
public boolean isSubsequence(String s, String t) {
        int prev = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = prev; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    cnt++;
                    prev = j + 1;
                    break;
                }
            }
        }
        if (cnt == s.length()) {
            return true;
        } else {
            return false;
        }

    }
}