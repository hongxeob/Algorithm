import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String str = "";
        for (String s : arr) {
            str += s;
        }


        return Long.parseLong(str);

    }
}
