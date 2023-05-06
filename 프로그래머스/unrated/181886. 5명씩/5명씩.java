class Solution {
        public String[] solution(String[] names) {
        String[] answer;
        int size = names.length / 5;
        if(names.length % 5 != 0){
            size += 1;
        }
        answer = new String[size];
        int idx = 0;
        for(int i = 0; i < size; i++){
            answer[i] = names[idx];
            idx += 5;
        }
        return answer;
    }
}