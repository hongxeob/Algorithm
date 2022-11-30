class Solution {
   public int solution(int slice, int n) {
        int requiredPizza = n / slice;
        if (n % slice == 0) {
            return requiredPizza;
        } else {
            return requiredPizza + 1;
        }     
    }
}