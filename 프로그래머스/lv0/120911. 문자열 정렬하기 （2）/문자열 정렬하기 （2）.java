import java.util.Arrays;
class Solution {
   public String solution(String my_string) {
        my_string = my_string.toLowerCase(); // 소문자로 바꿔주고
        char[] list = my_string.toCharArray(); // char형 배열에 담는다.
        Arrays.sort(list); // 오름차순 정렬
        String answer = ""; // 변수 answer 선언
        answer = new String(list); // answer은 String화한 char변수 list
        return answer;
    }
}