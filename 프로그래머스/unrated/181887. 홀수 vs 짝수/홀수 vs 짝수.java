class Solution {
public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int eve = 0;
        for (int i = 0; i < num_list.length; i += 2) {
            odd += num_list[i];
        }
        for (int i = 1; i < num_list.length; i += 2) {
             eve += num_list[i];
        }
        return odd >= eve ? odd : eve;
    }
}