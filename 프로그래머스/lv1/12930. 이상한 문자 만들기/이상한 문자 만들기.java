class Solution {
 public String solution(String s) {
        String answer = "";
        boolean toUpper = true;

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                toUpper = true;
            } else {
                if (toUpper) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        return sb.toString();
    }
}