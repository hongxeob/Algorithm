import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> daily = new ArrayList<Integer>();

        for (int i = 0; i < score.length; i++) {
            if (daily.size() < k) {
                daily.add(score[i]);
                Collections.sort(daily);
                answer[i] = daily.get(0);
                continue;
            }
            if (daily.size() == k) {
                int minNum = daily.get(0);
                if (minNum < score[i]) {
                    daily.remove(0);
                    daily.add(score[i]);
                    Collections.sort(daily);
                }
                answer[i] = daily.get(0);
            }
        }

        return answer;
    }
}