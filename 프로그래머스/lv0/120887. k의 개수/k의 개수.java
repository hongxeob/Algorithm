class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int a = i; a <= j; a++) {
            String sNum = Integer.toString(a);
            if (sNum.contains(String.valueOf(k))) {
                int check = a;
                while (check != 0) {
                    if (check % 10 == k) {
                        answer++;
                        check /= 10;
                    } else {
                        check /= 10;
                    }
                }
            }
        }
        return answer;
    }
}