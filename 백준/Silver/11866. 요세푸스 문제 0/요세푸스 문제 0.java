import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while (q.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                int val = q.poll(); // 맨 앞 꺼내기
                q.offer(val); // 맨뒤에 붙이기
            }
            sb.append(q.poll()).append(", "); // 뒤로 보내고 가장 앞에 있는 것 출력
        }

        sb.append(q.poll()).append('>');
        System.out.println(sb);
    }
}
