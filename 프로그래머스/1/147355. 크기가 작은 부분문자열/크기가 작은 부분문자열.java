class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        Long num = Long.parseLong(p);
        
        //t for문 돌면서 p.length개씩 자르기
        for(int i=0; i<t.length()-pLength+1; i++){
            String str = t.substring(i,i+pLength);
            if(num >= Long.parseLong(str)){
                answer++;
            }
        }
        
        return answer;
    }
}