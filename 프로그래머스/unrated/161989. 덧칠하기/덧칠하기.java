class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int max = 0; // 빈곳 시작점 + 롤러 길이 
        for (int i = 0; i < section.length; i++) {
            if (section[i] < max) {
                continue; // 빈곳의 인덱스가 max의 범위 안에 있으면 패스(이미 칠해져 있다는 말)
            }
            answer += 1;
            max = section[i] + m;
        }
        return answer;
    }
}