class Solution {
   public int solution(int n) {
        int answer = 0;
        String st = "";
        while (n != 0) {
            st += n % 3;
            n /= 3;
        }
        return Integer.parseInt(st,3);
    }
}