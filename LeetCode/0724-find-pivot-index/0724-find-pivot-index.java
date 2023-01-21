class Solution {
       public int pivotIndex(int[] nums) { //[1,7,3,6,5,6]
        int sum = 0; //28
        int leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}