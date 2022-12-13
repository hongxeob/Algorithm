import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int i = 2;
        while (n >= 2) {
            if (n % i == 0) {
                list.add(i);
                n = n / i;
            } else {
                i++;
            } 
        }
        answer = list.stream().distinct().mapToInt(Integer::intValue).toArray();
    
        return answer;
    }
}