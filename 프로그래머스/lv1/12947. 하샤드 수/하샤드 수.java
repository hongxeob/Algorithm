class Solution {
    public boolean solution(int x) { //13
        int sum = 0;
        int temp = x;
        while (temp >= 1) {
            sum += temp % 10;
            temp /= 10;
        }
        if (x % sum == 0) {
            return true;
        }
        return false;
    
    }
}
