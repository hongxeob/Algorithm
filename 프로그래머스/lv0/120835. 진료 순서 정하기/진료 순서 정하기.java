import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(copy);
        //원래 배열과 오름차순한 배열을 두고 각 자리마다 어떤 규칙이 있는지 보자
        //원래 배열의 i번째 수는 오름차순 배열의 몇번째 배열에 있는지 확인 후, 그 배열의 길이-인덱스를 해주니 결과가 나왔다. 
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < copy.length; j++) {
                if (emergency[i] == copy[j]) {
                    answer[i] = copy.length - j;
                }
            }
        }
        return answer;
    }
}