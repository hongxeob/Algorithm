class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int gcd = GCD(arr[0], arr[1]);
        int lcm = arr[0] * arr[1] / gcd;
        for (int i = 2; i < arr.length; i++) {
            gcd = GCD(lcm, arr[i]);
            lcm = lcm * arr[i] / gcd;
        }
        answer = lcm;
        return answer;
    }

    private int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }
}