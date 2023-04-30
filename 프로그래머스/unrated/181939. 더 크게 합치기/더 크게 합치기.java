class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = String.valueOf(a);
        String a2 = String.valueOf(b);
        
        return Integer.parseInt(a1+a2) >= Integer.parseInt(a2+a1) ? Integer.parseInt(a1+a2):Integer.parseInt(a2+a1) ;
    }
}