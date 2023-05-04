import java.util.*;
class Solution {
      public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        String[] arr = my_string.split(" ");
        for (String s : arr) {
            if (!s.equals("")) {
                list.add(s);
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}