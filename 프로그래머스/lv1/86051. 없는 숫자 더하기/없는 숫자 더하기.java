class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j]) {
                    break;
                }
                if (j == numbers.length - 1) {
                    answer += i;
                }
            }
        }
        return answer;
    }
}