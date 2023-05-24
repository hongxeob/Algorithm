class Solution {
public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split("");
        boolean space = true;
        for (String s1 : arr) {
            answer += space ? s1.toUpperCase() : s1;
            space = s1.equals(" ") ? true : false;
        }

        return answer;
    }
}