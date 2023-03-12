class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(" ")) {
                idx = 0;
            } else {
                if (idx % 2 == 0) {
                    idx++;
                    split[i] = split[i].toUpperCase();
                } else {
                    idx++;
                    split[i] = split[i].toLowerCase();
                }
            }
            answer += split[i];
        }
        return answer;
    }
}