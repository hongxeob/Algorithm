import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[201];
        for (int i = 0; i < n; i++) {
            v[sc.nextInt() + 100]++;
        }
        System.out.println(v[sc.nextInt() + 100]);
    }
}


