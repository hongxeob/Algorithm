class Solution {
public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        String[] arr = t.split("");
        int index = 0, count = 0;
        String sub = String.valueOf(s.charAt(index++));

        for (int i = 0; i < t.length(); i++) {
            if (sub.equals(arr[i])) {
                if (index == s.length()) {
                    count++;
                    break;
                }
                sub = String.valueOf(s.charAt(index++));
                count++;
            }
        }

        if (count == s.length()) return true;
        else return false;
    }
}