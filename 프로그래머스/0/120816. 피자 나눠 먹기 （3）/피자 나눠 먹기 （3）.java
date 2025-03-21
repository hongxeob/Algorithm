class Solution {
    public int solution(int slice, int n) {
        int requirePizza = n / slice;
        if( n % slice == 0){
            return requirePizza;
        }else{
            return requirePizza +1;
        }

    }
}