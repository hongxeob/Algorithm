class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        answer[0] = strArr[0].toLowerCase();
        for (int i = 1; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            } 
        }
        return answer;
    }
}