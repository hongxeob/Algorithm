import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static int answer;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String sik = sc.nextLine();

        String[] arr = sik.split("-");

        for (int i = 0; i < arr.length; i++) {
            int sum = getSum(arr[i]);
            if (i == 0) {
                answer += sum;
            } else {
                answer -= sum;
            }
        }
        System.out.println(answer);
    }

    private static int getSum(String arr) {
        int sum = 0;
        String[] split = arr.split("\\+");
        for (int j = 0; j < split.length; j++) {
            sum += Integer.parseInt(split[j]);
        }
        return sum;
    }
}