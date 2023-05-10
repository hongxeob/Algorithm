import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] arr = myString.split("x");
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i].length());
        }
        if (myString.endsWith("x")) {
            list.add(0);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}