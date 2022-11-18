import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 몇개의 숫자가 들어갈건지 입력 받음
        String a = sc.next(); // n개의 문자열에 들어갈 숫자를 받는다.
        sc.close();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += a.charAt(i) - '0'; // char를 int로 바꾸는법? 아스키 코드를 활용하자
        }
        System.out.println(sum);
    }
}