class Solution {
    public String solution(int age) {
        String answer = "";
        String old = String.valueOf(age);
        String[] arr = old.split("");

        for (int i = 0; i < arr.length; i++) {
            answer += (char) (Integer.parseInt(arr[i]) + 97); // 소문자 a(여기서는 0)의 정수 아스키코드는 97이다
        }
        return answer;
    }
}