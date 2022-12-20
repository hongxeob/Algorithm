class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" +");
        int beforeXNum = 0;
        int onlyNum = 0;
        for (String s : arr) {
            if (s.equals("x")) {
                beforeXNum++;
            } else if (s.contains("x")) {
                beforeXNum += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if (!s.equals("+")) {
                onlyNum += Integer.parseInt(s);
            }
        }
        if (beforeXNum != 0 && onlyNum == 0) {
            if (beforeXNum == 1) {
                answer += "x";
            } else {
                answer += beforeXNum + "x";
            } 
        }
        if (beforeXNum != 0 && onlyNum != 0) {
            if (beforeXNum == 1) {
                answer += "x" + " + " + onlyNum;
            } else {
                answer += beforeXNum + "x" + " + " + onlyNum;
            } 
        }
        if (beforeXNum == 0 && onlyNum != 0) {
            answer += onlyNum;
        }
        return answer;
    }
}