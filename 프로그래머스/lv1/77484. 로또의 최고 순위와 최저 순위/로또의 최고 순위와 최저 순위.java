class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int win = 0;
        //먼저 맞춘 번호와 알아볼 수 없는 번호의 개수를 저장할 변수를 선언한다
        //반복문으로 구매한 번호와 당첨번호를 비교해 win 카운트를 증가시킨다. 
        //만약 구매한 로또번호가 알아볼 수 없는 번호라면 zero 카운트를 증가 시킨다
        for (int lotto : lottos) {
            if (lotto == 0) { // 번호를 알아볼 수 없는 경우
                zero++;
            } else {
                for (int win_num : win_nums) {
                    if (win_num == lotto) {
                        win++;
                    }
                }
            } 
        }
        answer[0] = (win+zero) > 1 ? 7-(win+zero) : 6; // 최고 순위
        answer[1] = win > 1 ? 7-win : 6;               // 최저 순위
        return answer;
    }
}