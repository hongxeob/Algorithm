class Solution {
     public int solution(int[] common) {
        int answer = 0;
        if ((common[1] - common[0]) == common[2] - common[1]) { //등차 수열은 두 번째 값-첫 번째값 == 세번째 값- 두번째 값 
            answer = common[common.length - 1] + (common[1] - common[0]); //마지막배열 에 두 수의 차를 더해준다. = 마지막 원소 다음에 올값
            return answer;
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]); // 등비 수열-> 두번째값 / 첫번째값의 결과를 두번째값에 곱해준다. -> 세번째 원소 
        }
        return answer;
    }
}