import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        //순서가 있는 List 컬렉션
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            //String을 오름차순 해야하므로 각 요구하는 n번째 인덱스의 문자를 요소의 맨 앞에 붙여준다(정렬하기 위해)
            list.add(strings[i].charAt(n) + strings[i]);
        }
        //앞에 붙인 n번째 요소를 통해 정렬
        Collections.sort(list);
        //answer 배열에 다시 담아주고
        answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            //정렬 후 다시 앞에 붙은 문자들을 떼어준다
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}