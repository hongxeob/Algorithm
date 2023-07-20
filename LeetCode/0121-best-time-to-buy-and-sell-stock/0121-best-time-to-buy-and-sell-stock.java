class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }else{
                int i1 = prices[i]-min;
                if(i1>ans){
                    ans=i1;
                }
            }
        }
        return ans;
    }
}