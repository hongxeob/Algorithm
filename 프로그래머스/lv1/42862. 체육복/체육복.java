import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int cnt = 0; //빌린 학생 수
        Arrays.sort(reserve);
        Arrays.sort(lost);
        //여벌 옷을 가지고 있는 학생이 도난 당하면 빌려줄 수 없다
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) { // 도난 학생 == 여벌 옷 가져온 학생
                    lost[i] = reserve[j] = -1; // -1로 초기화(다음 검색에서 제외)
                    cnt++;
                    break;
                }
            }
        }
        //옷을 빌려주고 -1로 만들어 뒤의 학생에게 빌려주지 않게 한다.
        for (int i : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (i == reserve[j] - 1 || i == reserve[j] + 1) { //여벌옷 가져온 사람의 뒷사람과 앞사람(-1, +1)중 k 즉, lost 잃어버린 사람이 있다면
                    reserve[j] = -1;
                    cnt++;
                    break;
                }
            }
        }
        answer = n - lost.length + cnt;
        return answer;
    }
}