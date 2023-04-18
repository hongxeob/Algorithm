class Solution {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        // answer[0]=nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            sum += temp;
            answer[i] = sum;
        }
        return answer;
    }
}