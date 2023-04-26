import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int length = elements.length;
        for(int size =1; size<=length; size++){
            for(int i=0; i<length; i++){
                int sum =0;    
                for(int j=0; j<size; j++){
                    int idx = (i+j)%length;
                    sum+=elements[idx];
                }
                set.add(sum);
            }
            
            
        }
        return set.size();
    }
}