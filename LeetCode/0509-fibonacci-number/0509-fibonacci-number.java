class Solution {
    public int fib(int n) {
       if(n<=1) return n;
        
        int first = 0;
        int second = 1;
        
        int next = 0;
        for(int i=0; i<n-1; i++){
            next = first + second;
            first = second;
            second = next;
        }
        return next;
    }
}