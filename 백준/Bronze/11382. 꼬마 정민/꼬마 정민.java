import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a + b + c);
    }
}
