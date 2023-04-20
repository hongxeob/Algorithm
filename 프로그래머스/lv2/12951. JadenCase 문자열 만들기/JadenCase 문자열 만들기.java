class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.toLowerCase().split("");
        boolean space = true;
        for (String ss : split) {
            answer += space ? ss.toUpperCase() : ss;
            space = ss.equals(" ") ? true : false;
        }

        return answer;
    }
}