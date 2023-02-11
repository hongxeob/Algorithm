class Solution {
    public int solution(int n) {
        int answer = 0;
        //숫자를 2부터 시작하므로 앞에 공백 두칸을 남겨준다
        //-> 그래야 마지막 배열에 n의 숫자가 들어간다  
        int[] nums = new int[n + 1];
        //1은 소수가 아니고, 소수는 2부터 시작. 2부터 배열에 담는다 
        for (int i = 2; i <= n; i++) {
            nums[i] = i;
        }
        //2부터 소수의 배수들을 하나씩 지워 나간다 (만약 앞 요소의 0이면 넘어간다)
        for (int i = 2; i < n; i++) {
            if (nums[i] == 0) {
                continue;
            }
            //시작은 소수의 배수부터 시작, 증가는 그 소수 만큼 (왜? 배수들을 삭제 해야하니까)
            for (int j = 2 * i; j <= n; j += i) {
                //원본 소수는 그대로 두고 그 배수들은 0으로 만들어준다 
                nums[j] = 0;
            }
        }
        //배열을 돌며 0으로 만들어준 배수를 제외하고, 남은 소수들을 찾는다
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                answer++;
            }
        }
        return answer;
    }
}