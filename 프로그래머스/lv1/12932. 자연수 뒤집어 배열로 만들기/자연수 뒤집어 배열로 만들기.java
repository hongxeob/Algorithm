class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        int[] answer = new int[chars.length];
        for (int i = str.length()-1; i >= 0; i--) {
            answer[str.length()-1-i] = str.charAt(i) - '0';
        }
        return answer;
    }
}