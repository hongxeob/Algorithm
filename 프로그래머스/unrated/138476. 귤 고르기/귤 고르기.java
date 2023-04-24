import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> sizeMap = new HashMap<Integer, Integer>(); //사이즈,갯수
        for (int size : tangerine) {
            sizeMap.put(size, sizeMap.getOrDefault(size, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(sizeMap.values());
        Collections.sort(list,Collections.reverseOrder());
        for(Integer i : list){
            k-=i;
            answer++;
            if(k<1){
                return answer;
            }
        }
        return answer;
    }
}
