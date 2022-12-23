import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(sides); // [7,11]
        for (int i = 1; i <= sides[1]; i++) {
            if (i + sides[0] > sides[1]) {
                cnt++;
            }
        }
        for (int i = sides[0] + sides[1]-1; i > sides[1]; i--) {
            cnt++;
        }
        return cnt;
    }
}