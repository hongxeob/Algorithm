class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr = my_string.split("");
        for (int i = 0; i < arr.length; i++) {
            if (i == num1) {
                answer = answer + arr[num2];
            } else if (i == num2) {
                answer = answer + arr[num1];
            } else {
                answer += arr[i];
            } 
        }
        return answer;
    }
}