class Solution {
   public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) { // array의 사이즈 만큼 인덱스를 반복. 무엇을?
            String num = Integer.toString(array[i]); // array[i]를 문자열로 바꾸어 문자열 변수 num에 저장
            String[] arr = num.split(""); // 저장된 각 문자형 숫자들을 하나씩 쪼갠다.
            for (int j = 0; j < arr.length; j++) { // 쪼개어 들어간 문자열 배열 사이즈만큼 반복. 무엇을?
                if (arr[j].equals("7")) { // 각 인덱스의 자리에 7이 있으면
                    answer++; // answer 1 증가
                }
            }
        }
        return answer;
    }
}