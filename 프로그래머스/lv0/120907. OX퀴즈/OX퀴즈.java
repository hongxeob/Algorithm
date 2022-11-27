class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length]; // 정답 담을 새로운 배열 만들고 
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" "); // 새로운 배열에 원래 배열["3-4=-3","5+6=11"]의 i번째들을 쪼개서 하나씩 넣고
            if (arr[1].equals("+")) { // 쪼개어 넣은 arr배열의 [1]번째에 +가 있으면 
                //더하기의 경우 수식이 맞는지  확인.
                if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) { // 문자열을 정수화한 0번째,2번째 배열의 합이 네번째 배열과 같으면 (3 + 4=7") 
                    answer[i] = "O"; //현재 answer(String[quiz.length])의 i번째(0번째)에 정답 저장 . 즉 원래 배열의 i번째 연산자리에 정답을 넣어줌
                } else {
                    answer[i] = "X";
                }
                //뺄셈의 경우 수식이 맞는지 확인
            } else if (arr[1].equals("-")) {
                if (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}