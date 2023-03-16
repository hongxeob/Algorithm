import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        answer = new int[set.size()];
        List<Integer> arr = new ArrayList<>(set);
        for (int i = 0; i < set.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}