class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int temp = numLog[0];
        for (int i = 0; i < numLog.length; i++) {
            switch (numLog[i] - temp) {
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                    break;
                case 10:
                    answer += "d";
                    break;
                case -10:
                    answer += "a";
                    break;
            }
            temp = numLog[i];
        }
        return answer;
    }
}