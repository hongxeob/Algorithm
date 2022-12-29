class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < answer.length; i++) {
            answer[i] = x * i+x;
        }
        return answer;
    }
}