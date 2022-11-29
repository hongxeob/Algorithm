class Solution {
   public int solution(int num, int k) {
        String numS = Integer.toString(num); // 정수를 String화
        String sK = Integer.toString(k); // 정수를 String화
        if (numS.indexOf(sK) == -1) { // numS에 sK가 없으면 -1
            return -1;
        } else {
            return numS.indexOf(sK) + 1; // 있으면 그 자릿수 반환.근데 0부터 시작하니 +1
        }
    }
}