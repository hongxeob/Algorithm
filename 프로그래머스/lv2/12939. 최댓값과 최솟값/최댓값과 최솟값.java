class Solution {
    public String solution(String s) {
        String answer = "";
        //문자열 s를 공백 단위로 쪼갠다
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE; // 223232323...
        int max = Integer.MIN_VALUE; // -23232323....
        //쪼갠것을 parseint해서 최대 최소 비교
        //단 공백인 경우는 넘어간다.
        for (int i = 0; i < arr.length; i++) {
            int number = Integer.parseInt(arr[i]);
            max = Math.max(number, max);
            min = Math.min(number, min);
        }
        answer = min + " " + max;
        //최대 최소를 공백을 기준으로 리턴
        return answer;
    }
}