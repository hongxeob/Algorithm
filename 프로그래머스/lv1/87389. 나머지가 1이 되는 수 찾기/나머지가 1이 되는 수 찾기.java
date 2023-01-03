class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                a = i;
                break;
            }

        }
        return a;
    }
}