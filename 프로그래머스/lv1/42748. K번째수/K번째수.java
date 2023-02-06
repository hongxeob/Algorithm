import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // answer의 길이는 commands의 길이와 같다
        for (int i = 0; i < commands.length; i++) {
            //Arrays.copyOfRange(복사할 배열, 시작점(시작점 포함),끝점(끝점 전 까지 포함, 끝점 포함 X) = 복사할 배열을 넣어, 범위를 지정해주고 새롭게 복사한다
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp); // 복사되어 나온 배열 오름차순 정렬
            answer[i] = temp[commands[i][2] - 1]; //answer에 [i][2]번째 수를 넣어준다 (문제는 1부터 시작,배열은 0부터 시작이므로 -1 해줌)
        }
        return answer;
    }
}
