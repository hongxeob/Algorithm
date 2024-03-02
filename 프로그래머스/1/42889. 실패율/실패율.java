import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
            Map<Integer, Double> map = new HashMap<>();

            for (int i = 1; i <= N; i++) {
                double total = 0;
                double fail = 0;
                for (int j = 0; j < stages.length; j++) {
                    //i보다 크면 해당 스테이지는 넘어갔다는 말. 즉 성공했다는 말.
                    if (i <= stages[j]) total++;
                    //현재 해당 스테이지에 도달 했다는 뜻, 즉 실패한 상태
                    if (i == stages[j]) fail++;
                }
                if (total == 0 && fail == 0) total = 1;
                map.put(i, fail / total);
            }

            int[] answer = new int[N];
            for (int i = 0; i < N; i++) {
                double max = -1;
                int rKey = 0;
                for (int key : map.keySet()) {
                    if (max < map.get(key)) {
                        //실패율 구한다.
                        max = map.get(key);
                        //해당 실패율이 몇번째 스테이지인지 저장
                        rKey = key;
                    }
                }
                answer[i] = rKey;
                map.remove(rKey);
            }

            return answer;
        }
}

