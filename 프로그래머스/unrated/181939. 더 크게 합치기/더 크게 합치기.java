class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        if (a == b) {
            return Integer.parseInt(a + "" + b);
        }
        int i = Integer.parseInt(a + "" + b);
        int j = Integer.parseInt(b + "" + a);

        if (i > j) {
            return i;
        } else {
            return j;
        }
    }
}