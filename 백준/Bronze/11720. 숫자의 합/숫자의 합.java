import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 몇개의 숫자가 들어갈건지 입력 받음
        String a = sc.next(); // n개의 문자열에 들어갈 숫자를 받는다.
        char[] cNum = a.toCharArray();
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
        
    }
}