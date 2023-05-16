import java.time.LocalDate;
class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate A = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate B = LocalDate.of(date2[0], date2[1], date2[2]);
        if (A.isBefore(B)) {
            return 1;
        } else {
            return 0;
        }
    }
}