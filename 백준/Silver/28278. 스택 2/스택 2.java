import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int select = sc.nextInt();
            if (select == 1) {
                int num = sc.nextInt();
                stack.push(num);
            } else if (select == 2) {
                if (!stack.isEmpty()) {
                    sb.append(stack.pop()).append('\n');
                } else {
                    sb.append(-1).append('\n');
                }
            } else if (select == 3) {
                sb.append(stack.size()).append('\n');
            } else if (select == 4) {
                if (stack.isEmpty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else {
                if (!stack.isEmpty()) {
                    sb.append(stack.peek()).append('\n');
                } else {
                    sb.append(-1).append('\n');
                }
            }
        }
        System.out.println(sb.toString());
    }
}
