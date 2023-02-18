class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int win = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
            } else {
                for (int win_num : win_nums) {
                    if (win_num == lotto) {
                        win++;
                    }
                }
            } 
        }
        answer[0] = win + zero > 1 ? 7 - (win + zero) : 6;
        answer[1]= win > 1 ? 7 - win : 6;
        return answer;
    }
}