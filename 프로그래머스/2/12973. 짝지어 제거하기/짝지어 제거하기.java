import java.util.*;
class Solution {
	public int solution(String s) { // baabaa

		Stack<Character> stack = new Stack<>();

		//글자를 자른다.
		for (char c : s.toCharArray()) {
			//스택이 비어있지 않고, 전 문자가 지금 문자랑 같으면 담겨있던거 제거
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		return stack.isEmpty() ? 1 : 0;
	}
}