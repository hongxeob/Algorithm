import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stud = new int[31];
        for (int i = 1; i < 29; i++) {
            int success = sc.nextInt();
            stud[success] = 1;
        }
        for (int i = 1; i < stud.length; i++) {
            if (stud[i] != 1) {
                System.out.println(i);
            }
        }

    }
}
