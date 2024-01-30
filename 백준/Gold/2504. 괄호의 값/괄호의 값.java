import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();

		int result = 0;
		int tmp = 1;

		L1:
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			switch (c) {
				case '(':
					stack.add('(');
					tmp *= 2;
					break;

				case '[':
					stack.add('[');
					tmp *= 3;
					break;

				case ')':
					if (stack.isEmpty() || stack.peek() != '(') {
						result = 0;
						break L1;
					} else {
						if (input.charAt(i - 1) == '(') result += tmp;
						stack.pop();
						tmp /= 2;
					}
					break;

				case ']':
					if (stack.isEmpty() || stack.peek() != '[') {
						result = 0;
						break L1;
					} else {
						if (input.charAt(i - 1) == '[') result += tmp;
						stack.pop();
						tmp /= 3;
					}
					break;
			}
		}

		if (!stack.isEmpty()) System.out.println(0);
		else System.out.println(result);
	}

}
