class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] arr = my_string.split("");
        for (int i = 0; i < my_string.length(); i++) {
            if (arr[i].contains(alp)) {
                answer += alp.toUpperCase();
            } else {
                answer += arr[i];
            } 
        }
        return answer;
    }
}