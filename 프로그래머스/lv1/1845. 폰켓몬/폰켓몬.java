import java.util.HashSet;

class Solution {
    public int solution(int[] nums) { // 3,1,2,3
       int half = nums.length / 2;
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]); // 3,1,2
        }
        if(half<set.size()) answer = half;
        else answer = set.size();
        return answer;
    }
}