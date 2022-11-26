class Solution {
   public int solution(int n) {
        int answer = 0;
        Double sqrt = Math.sqrt(n); // n값의 제곱근을 sqrt에 담아준다. Math.sqrt의 반환타입은 double형 이므로 변수 타입은 double로 선언.

        if (sqrt == sqrt.intValue()) { // 실수형인 sqrt 값을 intValue메소드에 넣어 정수값으로 반환
            answer = 1; // 같으면(제곱근이면) 1 
        } else { // 제곱근이 아니면 2
            answer = 2;
        }
        return answer;
    }
}