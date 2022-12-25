class Solution {
    public int[] solution(int[][] score) {
        int[] answer = {};
        int student = score.length;
        int[] arr = new int[student];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < student; i++) {
            for (int j = 0; j < student; j++) {
                if (score[i][0] + score[i][1] < score[j][0] + score[j][1]) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}