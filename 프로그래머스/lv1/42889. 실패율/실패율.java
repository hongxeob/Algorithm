import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] fails = new int[N];
        int[] users = new int[N];
        //시도자, 실패자 카운트
        for (int stage : stages) {
            //마지막 스테이지를 깨지 않았을 경우
            if (stage != N + 1) {
                fails[stage - 1]++;

                //시도한 유저 카운트
                for (int i = 0; i < stage; i++) {
                    users[i]++;
                }
                //마지막 스테이지를 깼을 경우
            } else {
                //시도한 유저 전부 카운트
                for (int i = 0; i < users.length; i++) {
                    users[i]++;
                }
            }
        }
        //실패율
        ArrayList<Double[]> failRate = new ArrayList<>();
        //실패율에 인덱스와 값 할당
        for (int i = 0; i < N; i++) {
            double rate = Double.isNaN((double) fails[i] / users[i]) ? 0 : (double) fails[i] / users[i];
            failRate.add(new Double[]{(double) i + 1, rate});
        }
        failRate.sort((((o1, o2) -> Double.compare(o2[1], o1[1]))));
        return failRate.stream().mapToInt(value -> value[0].intValue()).toArray();
    }
}