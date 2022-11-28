class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] arr = String.valueOf(n).split(""); // 문자열로 바꾸고 한 자리씩 쪼개어서 새롭게 저장 
        for(String a : arr){ // 쪼갠 문자를 반복 후 
            answer += Integer.parseInt(a); // 다시 정수로 바꾸어서 하나씩 더해준다.
        }
        return answer;
    }
}