import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int max = 0;
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] > max) {
                max = num[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1); // 배열의 시작은 0부터 -> 그래서 +1 해줌
    }
}