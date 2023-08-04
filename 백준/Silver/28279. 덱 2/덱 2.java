import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] commandArr = br.readLine().split(" ");
            int command = Integer.parseInt(commandArr[0]);

            switch (command) {
                case 1:
                    int x = Integer.parseInt(commandArr[1]);
                    deque.addFirst(x);
                    break;
                case 2:
                    x = Integer.parseInt(commandArr[1]);
                    deque.addLast(x);
                    break;
                case 3:
                    if (!deque.isEmpty())
                        bw.write(deque.pollFirst() + "\n");
                    else
                        bw.write("-1\n");
                    break;
                case 4:
                    if (!deque.isEmpty())
                        bw.write(deque.pollLast() + "\n");
                    else
                        bw.write("-1\n");
                    break;
                case 5:
                    bw.write(deque.size() + "\n");
                    break;
                case 6:
                    if (deque.isEmpty())
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case 7:
                    if (!deque.isEmpty())
                        bw.write(deque.peekFirst() + "\n");
                    else
                        bw.write("-1\n");
                    break;
                case 8:
                    if (!deque.isEmpty())
                        bw.write(deque.peekLast() + "\n");
                    else
                        bw.write("-1\n");
                    break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
