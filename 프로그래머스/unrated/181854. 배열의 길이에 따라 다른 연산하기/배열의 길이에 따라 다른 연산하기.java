class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        if (arr.length % 2 != 0) {
            answer[0] = arr[0] + n;
            for (int i = 1; i < arr.length; i++) {
                if (i % 2 == 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }

            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }
}