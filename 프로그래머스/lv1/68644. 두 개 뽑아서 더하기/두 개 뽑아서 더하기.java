import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        //중복이 있으면 안되므로 중복 허용이 안되는 HashSet 사용 (but 순서 보장 X) -> TreeSet 쓰면 정렬까지 됨!
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        //순서를 보장하기 위해 List로 변환
        List<Integer> arrayList = new ArrayList<>(set);
        //오름차순
//      Collections.sort(arrayList); -> hashSet 쓰면 정렬 해줘야 하지만 현재는 TreeSet(정렬도 되는)
        // int형 배열에 저장 하는 과정
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i); //hashSet은 get() 메소드 존재 X -> set은 순서와 상관없이 중복되지 않는 것을 저장하는게 목적익므로
        }
        return answer;
    }
}