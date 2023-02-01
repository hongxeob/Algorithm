import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        //중복이 있으면 안되므로 중복 허용이 안되는 HashSet 사용 (but 순서 보장 X)
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        //순서를 보장하기 위해 List로 변환
        ArrayList<Integer> arrayList = new ArrayList<>(set);
        //오름차순
        Collections.sort(arrayList);
        // int형 배열에 저장 하는 과정
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i); //hashSet은 get() 메소드 존재 X -> set은 순서와 상관없이 중복되지 않는 것을 저장하는게 목적이므로
        }
        return answer;
    }
}