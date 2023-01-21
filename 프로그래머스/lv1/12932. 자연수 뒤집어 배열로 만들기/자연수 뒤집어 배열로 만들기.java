class Solution {
    public int[] solution(long n) { //12345
        String arr = String.valueOf(n);
        char[] s = arr.toCharArray();
        int[] answer = new int[arr.length()];
        for (int i = arr.length() - 1; i >= 0; i--) {
            answer[arr.length() - 1 - i] = arr.charAt(i) - '0';
        }
        return answer;
    }
}