class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr = s.toLowerCase().split("");
        int p = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("p")) {
                p++;
            } else if (arr[i].equals("y")) {
                y++;
            }
        }
        if (p == y) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}