class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big = Math.max(n, m);
        int small = Math.min(n, m);
        answer[0] = gcd(big, small);
        answer[1] = big * small / answer[0];
        return answer;
    }

    static int gcd(int n, int m) {
        if (n % m == 0) return m;
        return gcd(m, n % m);
    }
}