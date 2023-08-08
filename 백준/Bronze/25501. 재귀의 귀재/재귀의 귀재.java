import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            cnt = 0;
            System.out.println(isPalindrome(s) + " " + cnt);
        }
    }

    static int isPalindrome(String s) {
        return recursion(s, 0, (s.length()) - 1);
    }

    static int recursion(String s, int start, int end) {
        cnt++;

        if (start >= end) {
            return 1;
        } else if (s.charAt(start) != s.charAt(end)) {
            return 0;
        } else {
            return recursion(s, (start + 1), (end - 1));
        }
    }
}
