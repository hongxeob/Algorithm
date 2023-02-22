class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] xArr = new int[10]; // X 숫자별 개수 파악용
        int[] yArr = new int[10]; // Y 숫자별 개수 파악용

        //숫자별로 배열 SET
        for (String x : X.split("")) {
            xArr[Integer.parseInt(x)]++;
        }
        for (String y : Y.split("")) {
            yArr[Integer.parseInt(y)]++;
        }
        //마지막(9)부터 반복하면서 둘 다 있는 숫자면 StringBuilder에 append!
        for (int i = 9; i >= 0; i--) {
            while (xArr[i] > 0 && yArr[i] > 0) {
                sb.append(i);
                xArr[i]--;
                yArr[i]--;
            }
        }
        String answer = "";
        if ("".equals(sb.toString())) {
            answer = "-1";
        } else if ("0".equals(sb.toString().substring(0, 1))) {
            answer = "0";
        } else {
            answer = sb.toString();
        }
        return answer;
    }
}