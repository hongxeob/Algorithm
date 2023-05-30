class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for (int i = 3; i < total; i++) {
            if (total % i == 0) {
                int width = total / i;
                if (width >= 1) {
                    if ((i - 2) * (width - 2) == yellow) {
                        answer[0] = i;
                        answer[1] = width;
                    }

                }
            }
        }
        return answer;
    }
}