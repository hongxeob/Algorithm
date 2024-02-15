import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (i != 0) {
                String s1 = words[i - 1]; // 이전 단어
                String s2 = words[i]; // 현재 단어
                char last = s1.charAt(s1.length() - 1);
                char first = s2.charAt(0);
                if (map.containsKey(s2) || last != first) {
                    answer[0] = (i % n) + 1; //먼저 떨어진 번호
                    answer[1] = (i / n) + 1; // 몇번째 차례에 떨어졌는지
                    return answer;
                }
            }
            map.put(words[i], 1);
        }

        return answer;
    }
}