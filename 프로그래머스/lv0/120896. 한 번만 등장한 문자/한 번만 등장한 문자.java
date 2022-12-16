import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) { //hello
        StringBuffer sb = new StringBuffer();
        String answer = "";
        String[] trans = s.split("");
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < trans.length; i++) {
            if (!arr.contains(trans[i])) {
                arr.add(trans[i]);
            }
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            String temp = arr.get(i);
            if (s.indexOf(temp) == s.lastIndexOf(temp)) {
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}