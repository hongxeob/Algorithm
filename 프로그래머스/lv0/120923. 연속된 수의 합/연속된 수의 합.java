class Solution {
    public int[] solution(int num, int total) {
        // 등차수열의 합 공식 응용
        int[] answer = new int[num];

        int nSum = num * (num + 1) / 2;
        int start = (total - nSum) / num;

        for (int i= 1; i < num+1; i++) {
            answer[i-1] = i + start;  
        }
        
        return answer;
    }
}