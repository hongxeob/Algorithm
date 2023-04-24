class Solution {
    public int maxProfit(int[] prices) {
        int answer =0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                int m = prices[i]-min;
                if(m>answer){
                    answer = m;
                }
            }
        }
        return answer;
    }
}