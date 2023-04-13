import java.util.Arrays;

class Solution
{
    public int solution(int[] A, int[] B) {//1.4.2 / 5.4.4
        int answer = 0;
        Arrays.sort(A); // 1.2.4
        Arrays.sort(B); // 4/4/5
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i]; //1,
        }


        return answer;
    }
}