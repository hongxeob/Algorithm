class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String numbs = my_string.toLowerCase().replaceAll("[a-z]", "");
        for (int i = 0; i < numbs.length(); i++) {
            answer += Integer.parseInt(numbs.substring(i, i + 1));
        }
        return answer;
    }
}