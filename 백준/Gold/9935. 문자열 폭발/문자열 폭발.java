import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String bomb = br.readLine();

		int strLength = str.length();
		int bombLength = bomb.length();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < strLength; i++) {
			int cnt = 0;
			stack.push(str.charAt(i));

			if (stack.size() >= bombLength) {
				for (int j = 0; j < bombLength; j++) {
					if (stack.get(stack.size() - bombLength + j) != bomb.charAt(j)) {
						break;
					} else {
						cnt++;
					}

					if (cnt == bombLength) {
						for (int k = 0; k < bombLength; k++) {
							stack.pop();
						}
					}
				}
			}
		}
		if (stack.isEmpty()) {
			System.out.println("FRULA");
		} else {
			for (Character c : stack) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}
