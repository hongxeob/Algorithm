class Solution {
    public int pivotIndex(int[] nums) {
        int sum= Arrays.stream(nums).sum();
        int answer =0;
        int left =0;
        int pivot =0;
        for(int i=0; i<nums.length; i++){
            pivot = i;
            sum-=nums[i];
            if(sum==left){
                return pivot;
            }
            left+=nums[i];
        }
        return -1;
    }
}