import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        //재료가 하나씩 쌓인다(스택)
        for (int i : ingredient) {
            stack.push(i);
            //햄버거를 만들 수 있는 조건 1.(빵,야채,고기,빵) -> 사이즈가 4이상이 되면
            if (stack.size() >= 4) {
                int size = stack.size();
                // 햄버거를 만들 수 있는 조건 2. 햄버거 재료가 순서대로 있는지 확인(스택이니 거꾸로  생각해서 1,3,2,1 순으로)
                if (stack.get(size - 1) == 1 
                        && stack.get(size - 2) == 3 
                        && stack.get(size - 3) == 2 
                        && stack.get(size - 4) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }
}