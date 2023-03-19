import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int pickNum = nums.length / 2;
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (pickNum < set.size()) answer = pickNum;
        else answer = set.size();
        return answer;
    }
}