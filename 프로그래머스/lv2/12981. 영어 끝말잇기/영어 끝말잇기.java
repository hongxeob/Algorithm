import java.util.*;
class Solution {
   public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (i != 0) {
                String prev = words[i - 1];
                String present = words[i];
                char last = prev.charAt(prev.length() - 1);
                char first = present.charAt(0);
                if (map.containsKey(present) || last != first) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    return answer;
                }
            }
            map.put(words[i], 1);
        }
        return answer;
    }
}