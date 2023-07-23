import java.util.Arrays;
import java.util.List;

class Solution {
    public long solution(int n, int[] times) {// 6 [7, 10] 28
            long answer = 0;
            Arrays.sort(times);
            long start = 0;
            long end = (long) n * times[times.length - 1];

            while (start <= end) {
                long mid = start + (end - start) / 2;
                long sum = 0;
                for (int i = 0; i < times.length; i++) {
                    sum += mid / times[i];
                }
                if (sum < n) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                    answer = mid;
                }
            }
            return answer;
    }
}