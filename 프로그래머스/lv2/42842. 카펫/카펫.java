class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for (int i = 1; i <= sum; i++) {
            int height = i; //세로
            int width = sum / height; // 가로
            if (height> width) {
                continue;
            }
            if ((height - 2) * (width - 2) == yellow) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        return answer;
    }
}