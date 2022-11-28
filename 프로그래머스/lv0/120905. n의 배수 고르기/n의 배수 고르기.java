class Solution {
 public int[] solution(int n, int[] numlist) {
        int[] arr = new int[numlist.length]; // 배수인지 확인할 배열 만들고
        int cnt = 0; // 숫자들을 담을 변수
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) { // [i]번째 숫자가 n으로 나누어지면
                arr[cnt] = numlist[i]; // numlist[i]번째 수를 담는다. cnt의 그 자리에 그숫자를 담음 
                cnt++; // 담긴 그 숫자 다음 인덱스로 증가한다 (인덱스 한칸 이동한다고 보면 될듯?!)
            }
        }
        int[] answer = new int[cnt]; // 정답은 cnt의 배열을 가진다.
        for (int i = 0; i < cnt; i++) { // cnt 만큼 for문을 돌면서 
            answer[i] = arr[i]; // answer[i] 각 자리에 넣어준다
        }
        return answer;
    }
}