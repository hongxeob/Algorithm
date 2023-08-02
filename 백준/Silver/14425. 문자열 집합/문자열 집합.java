import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String stringN = sc.next();
            map.put(stringN, 0);
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            if (map.containsKey(sc.next())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
