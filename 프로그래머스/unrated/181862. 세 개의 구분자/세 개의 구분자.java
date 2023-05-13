import java.util.*;
class Solution {
       public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a|b|c", " ");
        ArrayList<String> list = new ArrayList<>();
        String[] arr = myStr.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                list.add(arr[i]);
            }
        }
        String[] answer = new String[list.size()];
        if (answer.length == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
            return answer;
        }
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}