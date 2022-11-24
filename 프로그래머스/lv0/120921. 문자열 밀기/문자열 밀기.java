class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String tA = A; // A를 담아줄 String 변수

        for (int i = 0; i < A.length(); i++) {
            if (tA.equals(B)) { // 결국 A의 변형인 tA 와 비교군 문자열 B와 같아질 때는 몇번 반복 인가?
                return answer;
            }
            String a = tA.substring(tA.length() - 1); // 문자열 a는 tA(A)의 맨 끝의 문자를 자른걸 저장
            tA = a + tA.substring(0, tA.length() - 1); // 새로 만들어진 A(tA)는 a(기존 A의 맨끝을 잘라낸것)+tA(A)의 맨 앞 문자~맨끝 한칸 앞 문자를 더한것
            answer++;
        }
        return -1;
    }
}