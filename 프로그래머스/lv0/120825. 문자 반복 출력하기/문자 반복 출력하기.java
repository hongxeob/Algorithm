class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] split = my_string.split("");
        for (int i = 0; i < split.length; i++) {
            answer += split[i].repeat(n);
            
        }
        return answer;
    }
}