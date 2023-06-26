import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        String[] arr = my_string.split(" ");
        
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}