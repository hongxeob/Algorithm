class Solution {
  
	int answer;
	int[] numbers;
	int target;
        
    public int solution(int[] numbers, int target) {
      this.numbers = numbers;
		this.target = target;
		dfs(0, 0);
		return answer;
    }
        
    void dfs(int idx, int sum){
        //탈출
        if(idx==numbers.length){
            if(target==sum) answer++;
            return;
        }
        //동작
        dfs(idx+1,sum+numbers[idx]);
        dfs(idx+1,sum-numbers[idx]);
    }
}