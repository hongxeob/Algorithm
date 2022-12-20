class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" +");
        int linear = 0;
        int constant = 0;
        for (String s : arr) {
            if (s.equals("x")) { // 잘라서 for문 돌리다가 x 그자체이면 
                linear++; // x앞에 붙여줄 변수 증가
            } else if (s.contains("x")) { // x가 2이상의 값이면(x가 숫자를 포함하고 있으면)
                linear += Integer.parseInt(s.substring(0, s.length() - 1)); // 숫자만 잘라낸다. 
            } else if (!s.equals("+")) {
                constant += Integer.parseInt(s); // x랑 같지도,x를 포함하지도,부호도 아니고, 스트링형 숫자이면 고정값 증가
            }
        }
        if (linear != 0 && constant == 0) { //x앞에 붙는 숫자가 있고, only숫자가 0이면
            if (linear == 1) { //x가 1이면, 즉 1x 이면
                answer += "x"; //x만 출력
            } else {
                answer += linear + "x"; //2이상 이면 ex)2x
            }
        }
        if (linear != 0 && constant != 0) { // 다항식의 합(ex:2x+1,x+1)
            if (linear == 1) { //ex: x+1
                answer += "x" + " + " + constant;
            } else { // ex : 2x+1
                answer += linear + "x" + " + " + constant;
            }
        }
        if (linear == 0 && constant != 0) { // x는 없고 정수만
            answer += constant; 
        }
        return answer;
    }
}