class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int second = 2 * a * b;
        String aS = String.valueOf(a);
        String bS = String.valueOf(b);
        int first = Integer.parseInt(aS + bS);

        return Math.max(first, second);
    }
}