import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String[] arr = myString.split("x");
        
        
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("")){
                list.add(arr[i]);
            }   
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}