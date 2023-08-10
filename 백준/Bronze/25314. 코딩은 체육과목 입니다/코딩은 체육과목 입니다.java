import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String answer = "";

        int long1 = n / 4;

        for (int i = 0; i < long1; i++) {
            answer += "long ";
        }
        System.out.println(answer + "int");
    }
}
