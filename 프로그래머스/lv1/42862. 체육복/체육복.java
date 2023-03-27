import java.util.Arrays;

class Solution {
     public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = reserve[j] = -1;
                    cnt++;
                    break;
                }
            }
        }
        for (int k : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (k == reserve[j] - 1 || k == reserve[j] + 1) {
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