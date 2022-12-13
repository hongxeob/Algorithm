import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        int[] answer = new int[my_string.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i]=my_string.charAt(i)-'0'; // '0'은 아스키코드 48이기 때문에 빼준다, 이 과정이 없으면 안된다
        }
        Arrays.sort(answer);
        return answer;
    }
}